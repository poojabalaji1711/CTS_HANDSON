import React from "react";

function ListofIndianPlayers(props) {
  const mergedPlayers = [
    "Sachin",
    "Dhoni",
    "Virat",
    "Rohit",
    "Raina",
    "Jadeja",
    ...props.IndianPlayers,
  ];

  return (
    <div>
      <ul>
        {mergedPlayers.map((player, index) => (
          <li key={index}>{player}</li>
        ))}
      </ul>
    </div>
  );
}

export default ListofIndianPlayers;