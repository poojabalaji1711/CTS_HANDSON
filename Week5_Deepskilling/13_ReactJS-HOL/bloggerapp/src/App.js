import "./App.css";

import BookDetails from "./Components/BookDetails";
import BlogDetails from "./Components/BlogDetails";
import CourseDetails from "./Components/CourseDetails";

function App() {
  const showBooks = true;
  const showBlogs = true;
  const showCourses = true;

  return (
    <div className="container">

      {showCourses && (
        <div className="column">
          <h1>Course Details</h1>
          <CourseDetails />
        </div>
      )}

      {showBooks ? (
        <div className="column">
          <h1>Book Details</h1>
          <BookDetails />
        </div>
      ) : null}

      {showBlogs ? (
        <div className="column">
          <h1>Blog Details</h1>
          <BlogDetails />
        </div>
      ) : (
        <h2>No Blogs Available</h2>
      )}

    </div>
  );
}

export default App;