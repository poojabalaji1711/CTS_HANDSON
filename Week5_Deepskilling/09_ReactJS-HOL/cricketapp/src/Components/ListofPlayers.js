import { OddPlayers, EvenPlayers, IndianPlayers } from "./IndianPlayers";
import ListofIndianPlayers from "./ListofIndianPlayers";

function ListofPlayers({ players }) {
  if (players) {
    return (
      <ul>
        {players.map((player, index) => (
          <li key={index}>
            {player.name} - {player.score}
          </li>
        ))}
      </ul>
    );
  }

  const flag = false;

  if (flag) {
    return null;
  }

  return (
    <div>
      <h1>Odd Players</h1>
      <OddPlayers />

      <hr />

      <h1>Even Players</h1>
      <EvenPlayers />

      <hr />

      <h1>List of Indian Players Merged</h1>
      <ListofIndianPlayers IndianPlayers={IndianPlayers} />
    </div>
  );
}

export default ListofPlayers;