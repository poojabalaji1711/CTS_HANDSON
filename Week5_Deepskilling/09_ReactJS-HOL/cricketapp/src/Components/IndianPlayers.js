import React from "react";

const T20players = ["Sachin", "Dhoni", "Virat", "Rohit", "Raina", "Jadeja"];

const OddPlayers = () => {
  const odd = T20players.filter((player, index) => index % 2 === 0);

  return (
    <ul>
      {odd.map((player, index) => (
        <li key={index}>{player}</li>
      ))}
    </ul>
  );
};

const EvenPlayers = () => {
  const even = T20players.filter((player, index) => index % 2 !== 0);

  return (
    <ul>
      {even.map((player, index) => (
        <li key={index}>{player}</li>
      ))}
    </ul>
  );
};

const IndianPlayers = ["Gill", "Hardik", "Bumrah"];

export { OddPlayers, EvenPlayers, IndianPlayers };