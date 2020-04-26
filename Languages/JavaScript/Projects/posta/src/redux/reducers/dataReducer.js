import {
  SET_POSTERS,
  LIKE_POSTER,
  UNLIKE_POSTER,
  LOADING_DATA,
  DELETE_POSTER
} from "../types";

const initialState = {
  posters: [],
  poster: [],
  loading: false
};

export default function(state = initialState, action) {
  switch (action.type) {
    case LOADING_DATA:
      return {
        ...state,
        loading: true
      };
    case SET_POSTERS:
      return {
        ...state,
        posters: action.payload,
        loading: false
      };
    case LIKE_POSTER:
    case UNLIKE_POSTER:
      let index = state.posters.findIndex(
        poster => poster.posterId === action.payload.posterId
      );
      state.posters[index] = action.payload;
      return {
        ...state
      };
    case DELETE_POSTER:
      index = state.posters.findIndex(
        poster => poster.posterId === action.payload
      );
      state.posters.splice(index, 1);
      return {
        ...state
      };
    default:
      return state;
  }
}
