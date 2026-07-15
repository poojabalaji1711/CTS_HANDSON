import office from "./images/office.jpg";

function App() {
  const offices = [
    {
      name: "DBS",
      rent: 50000,
      address: "Chennai",
    },
    {
      name: "Regus",
      rent: 75000,
      address: "Bangalore",
    },
    {
      name: "WeWork",
      rent: 60000,
      address: "Hyderabad",
    },
  ];

  return (
    <div style={{ padding: "20px" }}>
      <h1>Office Space, at Affordable Range</h1>

      <img
        src={office}
        alt="Office Space"
        width="500"
        height="300"
      />

      <hr />

      {offices.map((item, index) => (
        <div key={index}>
          <h2>Name: {item.name}</h2>

          <h3
            style={{
              color: item.rent < 60000 ? "red" : "green",
            }}
          >
            Rent: Rs. {item.rent}
          </h3>

          <h3>Address: {item.address}</h3>

          <hr />
        </div>
      ))}
    </div>
  );
}

export default App;