import React, { Component } from "react";
import withStyles from "@material-ui/core/styles/withStyles";
import { Link } from "react-router-dom";
import dayjs from "dayjs";
import relativeTime from "dayjs/plugin/relativeTime";
import PropTypes from "prop-types";
import MyButton from "../util/MyButton";
import DeletePoster from "./DeletePoster";

//MUI stuffs
import Card from "@material-ui/core/Card";
import CardContent from "@material-ui/core/CardContent";
import CardMedia from "@material-ui/core/CardMedia";
import { Typography } from "@material-ui/core";

// Icons
import ChatIcon from "@material-ui/icons/Chat";
import FavoriteIcon from "@material-ui/icons/Favorite";
import FavoriteBorder from "@material-ui/icons/FavoriteBorder";

import { connect } from "react-redux";
import { likePoster, unlikePoster } from "../redux/actions/dataAction";

const styles = {
  card: {
    position: "relative",
    display: "flex",
    marginBottom: 3,
    width: "25rem",
    height: "13rem",
    borderRadius: "40px 10px 10px 10px"
  },
  image: {
    width: "6rem",
    height: "6rem",
    borderRadius: "50%"
  },
  content: {
    padding: 25,
    objectFit: "cover"
  }
};
export class Poster extends Component {
  likedPoster = () => {
    if (
      this.props.user.likes &&
      this.props.user.likes.find(
        like => like.posterId === this.props.poster.posterId
      )
    )
      return true;
    else return false;
  };

  likePoster = () => {
    this.props.likePoster(this.props.poster.posterId);
  };

  unlikePoster = () => {
    this.props.unlikePoster(this.props.poster.posterId);
  };
  render() {
    dayjs.extend(relativeTime);
    const {
      classes,
      poster: {
        body,
        createdAt,
        userImage,
        userHandle,
        posterId,
        likeCount,
        commentCount
      },
      user: {
        authenticated,
        credentials: { handle }
      }
    } = this.props;

    const likeButton = !authenticated ? (
      <MyButton tip="Like">
        <Link to="/login">
          <FavoriteBorder color="primary" />
        </Link>
      </MyButton>
    ) : this.likedPoster() ? (
      <MyButton to="Unlike" onClick={this.unlikePoster}>
        <FavoriteIcon color="primary" />
      </MyButton>
    ) : (
      <MyButton to="Like" onClick={this.likePoster}>
        <FavoriteBorder color="primary" />
      </MyButton>
    );

    const deleteButton =
      authenticated && userHandle === handle ? (
        <DeletePoster posterId={posterId} />
      ) : null;

    //const classes =  this.props.classes (destructuring);
    return (
      <Card className={classes.card}>
        <CardMedia
          image={userImage}
          title="Profile image"
          className={classes.image}
        />
        <CardContent className={classes.content}>
          <Typography
            variant="h5"
            component={Link}
            to={`/users/${userHandle}`}
            color="primary"
          >
            {userHandle}
          </Typography>
          {deleteButton}
          <Typography variant="body2" color="textSecondary">
            {dayjs(createdAt).fromNow()}
          </Typography>
          <Typography variant="body1">{body}</Typography>
          {likeButton}
          <span>{likeCount} Likes</span>
          <MyButton tip="comments">
            <ChatIcon color="primary" />
          </MyButton>
          <span>{commentCount} comments</span>
        </CardContent>
      </Card>
    );
  }
}

Poster.propTypes = {
  likePoster: PropTypes.func.isRequired,
  unlikePoster: PropTypes.func.isRequired,
  user: PropTypes.object.isRequired,
  poster: PropTypes.object.isRequired,
  classes: PropTypes.object.isRequired
};

const mapStateToProps = state => ({
  user: state.user
});

const macActionToProps = {
  likePoster,
  unlikePoster
};

export default connect(
  mapStateToProps,
  macActionToProps
)(withStyles(styles)(Poster));
