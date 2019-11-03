const { db } = require("../util/admin");

exports.getAllPosters = (req, res) => {
  db.collection("posters")
    .orderBy("createdAt", "desc")
    .get()
    .then(data => {
      let posters = [];
      data.forEach(doc => {
        posters.push({
          posterId: doc.id,
          body: doc.data().body,
          userHandle: doc.data().userHandle,
          createdAt: doc.data().createdAt,
          commentCount: doc.data().commentCount,
          likeCount: doc.data().likeCount,
          userImage: doc.data().userImage
        });
      });
      return res.json(posters);
    })
    .catch(err => {
      console.error(err);
      res.status(500).json({ error: err.code });
    });
};

exports.postOnePoster = (req, res) => {
  if (req.body.body.trim() === "") {
    return res.status(400).json({ body: "Body must not be empty" });
  }

  const newPoster = {
    body: req.body.body,
    userHandle: req.user.handle,
    userImage: req.user.imageUrl,
    createdAt: new Date().toISOString(),
    likeCount: 0,
    commentCount: 0
  };

  db.collection("posters")
    .add(newPoster)
    .then(doc => {
      const resPoster = newPoster;
      resPoster.posterId = doc.id;
      res.json(resPoster);
    })
    .catch(err => {
      res.status(500).json({ error: "something went wrong" });
      console.error(err);
    });
};

//Fetch one poster
exports.getPoster = (req, res) => {
  let posterData = {};
  db.doc(`/posters/${req.params.posterId}`)
    .get()
    .then(doc => {
      if (!doc.exists) {
        return res.status(404).json({ error: "Poster not found" });
      }
      posterData = doc.data();
      posterData.posterId = doc.id;
      return db
        .collection("comments")
        .orderBy("createdAt", "desc")
        .where("posterId", "==", req.params.posterId)
        .get();
    })
    .then(data => {
      posterData.comments = [];
      data.forEach(doc => {
        posterData.comments.push(doc.data());
      });
      return res.json(posterData);
    })
    .catch(err => {
      console.error(err);
      res.status(500).json({ error: err.code });
    });
};

//Comment one poster
exports.commentOnPoster = (req, res) => {
  if (req.body.body.trim() === "") {
    return res.status(400).json({ comment: "Must not be empty!" });
  }

  const newComment = {
    body: req.body.body,
    createdAt: new Date().toISOString(),
    posterId: req.params.posterId,
    userHandle: req.user.handle,
    userImage: req.user.imageUrl
  };

  db.doc(`/posters/${req.params.posterId}`)
    .get()
    .then(doc => {
      if (!doc.exists) {
        return res.status(404).json({ error: "Poster not found" });
      }
      return doc.ref.update({ commentCount: doc.data().commentCount + 1 });
    })
    .then(() => {
      return db.collection("comments").add(newComment);
    })
    .then(() => {
      res.json(newComment);
    })
    .catch(err => {
      console.error(err);
      res.status(500).json({ error: "Something went wrong" });
    });
};

//Like a poster
exports.likePoster = (req, res) => {
  const likeDocument = db
    .collection("likes")
    .where("userHandle", "==", req.user.handle)
    .where("posterId", "==", req.params.posterId)
    .limit(1);

  const posterDocument = db.doc(`/posters/${req.params.posterId}`);

  let posterData = {};

  posterDocument
    .get()
    .then(doc => {
      if (doc.exists) {
        posterData = doc.data();
        posterData.posterId = doc.id;
        return likeDocument.get();
      } else {
        return res.status(404).json({ error: "Poster not found" });
      }
    })
    .then(data => {
      if (data.empty) {
        return db
          .collection("likes")
          .add({
            posterId: req.params.posterId,
            userHandle: req.user.handle
          })
          .then(() => {
            posterData.likeCount++;
            return posterDocument.update({ likeCount: posterData.likeCount });
          })
          .then(() => {
            return res.json(posterData);
          });
      } else {
        return res.status(400).json({ error: "Poster already liked!" });
      }
    })
    .catch(err => {
      console.error(err);
      res.status(500).json({ error: err.code });
    });
};

exports.unlikePoster = (req, res) => {
  const likeDocument = db
    .collection("likes")
    .where("userHandle", "==", req.user.handle)
    .where("posterId", "==", req.params.posterId)
    .limit(1);

  const posterDocument = db.doc(`/posters/${req.params.posterId}`);

  let posterData = {};

  posterDocument
    .get()
    .then(doc => {
      if (doc.exists) {
        posterData = doc.data();
        posterData.posterId = doc.id;
        return likeDocument.get();
      } else {
        return res.status(404).json({ error: "Poster not found" });
      }
    })
    .then(data => {
      if (data.empty) {
        return res.status(400).json({ error: "Poster not liked!" });
      } else {
        return db
          .doc(`/likes/${data.docs[0].id}`)
          .delete()
          .then(() => {
            posterData.likeCount--;
            return posterDocument.update({ likeCount: posterData.likeCount });
          })
          .then(() => {
            res.json(posterData);
          });
      }
    })
    .catch(err => {
      console.error(err);
      res.status(500).json({ error: err.code });
    });
};

//Delete Poster
exports.deletePoster = (req, res) => {
  const document = db.doc(`/posters/${req.params.posterId}`);
  document
    .get()
    .then(doc => {
      if (!doc.exists) {
        return res.status(404).json({ error: "Poster not found" });
      }
      if (doc.data().userHandle !== req.user.handle) {
        return res.status(403).json({ error: "Unauthorized!" });
      } else {
        return document.delete();
      }
    })
    .then(() => {
      res.json({ message: "Poster deleted successfully!" });
    })
    .catch(err => {
      console.error(err);
      return res.status(500).json({ error: err.code });
    });
};
