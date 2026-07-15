import React, { Component } from "react";

class CountPeople extends Component {
  constructor() {
    super();

    this.state = {
      entrycount: 0,
      exitcount: 0,
    };
  }

  UpdateEntry = () => {
    this.setState((prevState) => ({
      entrycount: prevState.entrycount + 1,
    }));
  };

  UpdateExit = () => {
    this.setState((prevState) => ({
      exitcount: prevState.exitcount + 1,
    }));
  };

  render() {
    return (
      <div style={{ textAlign: "center", marginTop: "100px" }}>
        <button
          onClick={this.UpdateEntry}
          style={{ backgroundColor: "lightgreen", marginRight: "10px" }}
        >
          Login
        </button>

        <span>{this.state.entrycount} People Entered!!!</span>

        <br />
        <br />

        <button
          onClick={this.UpdateExit}
          style={{ backgroundColor: "lightgreen", marginRight: "10px" }}
        >
          Exit
        </button>

        <span>{this.state.exitcount} People Left!!!</span>
      </div>
    );
  }
}

export default CountPeople;