import React, { Component } from 'react';
import Post from './Post';

class Posts extends Component {

    constructor(props) {
        super(props);

        this.state = {
            posts: [],
            hasError: false
        };
    }

    loadPosts() {
        const posts = [
            new Post(
                1,
                "React Learning",
                "Welcome to learning React!"
            ),
            new Post(
                2,
                "Installation",
                "You can install React from npm."
            ),
            new Post(
                3,
                "Components",
                "Components let you split the UI into independent pieces."
            )
        ];

        this.setState({ posts: posts });
    }

    componentDidMount() {
        this.loadPosts();
    }

    componentDidCatch(error, info) {
        console.log(error);
        console.log(info);
        this.setState({ hasError: true });
    }

    render() {

        if (this.state.hasError) {
            return <h2>Something went wrong.</h2>;
        }

        return (
            <div style={{ margin: "20px" }}>
                <h1>Blog Details</h1>

                {this.state.posts.map(post => (
                    <div
                        key={post.id}
                        style={{
                            border: "1px solid gray",
                            padding: "10px",
                            marginBottom: "15px"
                        }}
                    >
                        <h3>{post.title}</h3>
                        <p>{post.body}</p>
                    </div>
                ))}
            </div>
        );
    }
}

export default Posts;