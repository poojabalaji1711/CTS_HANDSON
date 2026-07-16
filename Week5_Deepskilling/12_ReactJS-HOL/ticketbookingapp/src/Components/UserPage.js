import React from "react";

function UserPage() {
  return (
    <div>
      <h1>Welcome back</h1>

      <h2>Book Your Ticket</h2>

      <table border="1" cellPadding="8">
        <thead>
          <tr>
            <th>Flight</th>
            <th>From</th>
            <th>To</th>
            <th>Price</th>
          </tr>
        </thead>

        <tbody>
          <tr>
            <td>AI101</td>
            <td>Chennai</td>
            <td>Delhi</td>
            <td>₹5000</td>
          </tr>

          <tr>
            <td>AI205</td>
            <td>Bangalore</td>
            <td>Mumbai</td>
            <td>₹4500</td>
          </tr>
        </tbody>
      </table>

      <br />

      <button>Book Ticket</button>

      <br />
      <br />
    </div>
  );
}

export default UserPage;