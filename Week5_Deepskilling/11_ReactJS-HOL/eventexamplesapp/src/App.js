import React, { useState } from "react";
import CurrencyConvertor from "./Components/CurrencyConvertor";

function App() {
  const [counter, setCounter] = useState(5);

  const increment = () => {
    setCounter(counter + 1);
  };

  const decrement = () => {
    setCounter(counter - 1);
  };

  const sayHello = () => {
    alert("Hello! Member");
  };

  const increase = () => {
    increment();
    sayHello();
  };

  const sayWelcome = (msg) => {
    alert(msg);
  };

  const handleClick = () => {
    alert("I was clicked");
  };

  return (
    <div style={{ margin: "20px" }}>
      <h2>{counter}</h2>

      <button onClick={increase}>Increment</button>

      <br />
      <br />

      <button onClick={decrement}>Decrement</button>

      <br />
      <br />

      <button onClick={() => sayWelcome("Welcome")}>
        Say Welcome
      </button>

      <br />
      <br />

      <button onClick={handleClick}>
        Click on me
      </button>

      <br />
      <br />

      <CurrencyConvertor />
    </div>
  );
}

export default App;