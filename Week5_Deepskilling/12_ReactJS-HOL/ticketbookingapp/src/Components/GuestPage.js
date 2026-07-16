import React from "react";

function GuestPage() {
  return (
    <div>
      <h1>Please sign up.</h1>

      <h2>Flight Details</h2>

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
    </div>
  );
}

export default GuestPage;