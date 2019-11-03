import {
  SET_USER,
  SET_AUTHENTICATED,
  SET_UNAUTHENTICATED,
  LOADING_USER,
  LIKE_POSTER,
  UNLIKE_POSTER
} from "../types";

const initialState = {
  authenticated: false,
  loading: false,
  credentials: {},
  likes: [],
  notifications: []
};

export default function(state = initialState, action) {
  switch (action.type) {
    case SET_AUTHENTICATED:
      return {
        ...state,
        authenticated: true
      };
    case SET_UNAUTHENTICATED:
      return initialState;
    case SET_USER:
      return {
        authenticated: true,
        loading: false,
        ...action.payload
      };
    case LOADING_USER:
      return {
        ...state,
        loading: true
      };
    case LIKE_POSTER:
      return {
        ...state,
        likes: [
          ...state.likes,
          {
            userHandle: state.credentials.handle,
            posterId: action.payload.posterId
          }
        ]
      };

    case UNLIKE_POSTER:
      return {
        ...state,
        likes: state.likes.filter(
          like => like.posterId !== action.payload.posterId
        )
      };
    default:
      return state;
  }
}
