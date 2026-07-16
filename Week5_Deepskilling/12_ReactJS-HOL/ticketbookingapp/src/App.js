import React, { useState } from "react";
import LoginButton from "./Components/LoginButton";
import LogoutButton from "./Components/LogoutButton";
import GuestPage from "./Components/GuestPage";
import UserPage from "./Components/UserPage";

function App() {
  const [isLoggedIn, setIsLoggedIn] = useState(false);

  const login = () => {
    setIsLoggedIn(true);
  };

  const logout = () => {
    setIsLoggedIn(false);
  };

  return (
    <div style={{ margin: "50px" }}>
      {isLoggedIn ? (
        <>
          <UserPage />
          <LogoutButton onClick={logout} />
        </>
      ) : (
        <>
          <GuestPage />
          <LoginButton onClick={login} />
        </>
      )}
    </div>
  );
}

export default App;