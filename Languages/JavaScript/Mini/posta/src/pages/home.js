import React, { Component } from "react";
import { Grid } from "@material-ui/core";
import axios from "axios";
import Profile from "../components/Profile";
import PropTypes from "prop-types";

import Poster from "../components/Poster";

import { connect } from "react-redux";
import { getPosters } from "../redux/actions/dataAction";
export class home extends Component {
  componentDidMount() {
    this.props.getPosters();
  }
  render() {
    const { posters, loading } = this.props.data;

    let recentPostersMarkedup = !loading ? ( //Ternary operator
      posters.map(poster => <Poster key={poster.posterId} poster={poster} />)
    ) : (
      <p>Loading</p>
    );
    return (
      <Grid container spacing={7}>
        <Grid item sm={8} xs={12}>
          {recentPostersMarkedup}
        </Grid>
        <Profile />
        <Grid item sm={4} xs={1}></Grid>
      </Grid>
    );
  }
}

home.propTypes = {
  getPosters: PropTypes.func.isRequired,
  data: PropTypes.object.isRequired
};

const mapStateToProps = state => ({
  data: state.data
});

export default connect(
  mapStateToProps,
  { getPosters }
)(home);
