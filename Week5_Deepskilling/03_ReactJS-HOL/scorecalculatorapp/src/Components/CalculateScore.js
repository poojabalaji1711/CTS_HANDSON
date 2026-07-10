import React, { Component } from 'react';
import '../Stylesheets/mystyle.css';

class CalculateScore extends Component {

    constructor(props) {
        super(props);

        this.state = {
            Name: "Steeve",
            School: "DNV Public School",
            total: 284,
            goal: 3
        };
    }

    render() {

        const averageScore = this.state.total / this.state.goal;

        return (
            <div className="formatstyle">
                <h1>Student Details:</h1>

                <h3>Name : {this.state.Name}</h3>
                <h3>School : {this.state.School}</h3>
                <h3>Total : {this.state.total}</h3>
                <h3>Goal Subjects : {this.state.goal}</h3>
                <h2>Average Score : {averageScore}</h2>
            </div>
        );
    }
}

export default CalculateScore;