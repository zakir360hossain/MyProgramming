import {
  SET_POSTERS,
  LOADING_DATA,
  LIKE_POSTER,
  UNLIKE_POSTER,
  DELETE_POSTER
} from "../types";
import axios from "axios";

// Get all posters
export const getPosters = () => dispatch => {
  dispatch({ type: LOADING_DATA });
  axios
    .get("/posters")
    .then(res => {
      dispatch({
        type: SET_POSTERS,
        payload: res.data
      });
    })
    .catch(err => {
      dispatch({
        type: SET_POSTERS,
        payload: []
      });
    });
};

// Like a poster
export const likePoster = posterId => dispatch => {
  axios
    .get(`/poster/${posterId}/like`)
    .then(res => {
      dispatch({
        type: LIKE_POSTER,
        payload: res.data
      });
    })
    .catch(err => console.log(err));
};

// Unlike a poster
export const unlikePoster = posterId => dispatch => {
  axios
    .get(`/poster/${posterId}/unlike`)
    .then(res => {
      dispatch({
        type: UNLIKE_POSTER,
        payload: res.data
      });
    })
    .catch(err => console.log(err));
};

export const deletePoster = posterId => dispatch => {
  axios
    .delete(`/poster/${posterId}`)
    .then(() => {
      dispatch({ type: DELETE_POSTER, payload: posterId });
    })
    .catch(err => console.log(err));
};
