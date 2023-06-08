import logo from "./logo.svg";
import "./App.css";
import { useEffect, useState } from "react";

function App() {
    const [message, setMessage] = useState([]);

    useEffect(() => {
        fetch("/api/v1")
            .then((response) => response.json())
            .then((json) => setMessage(json.RESPONSE_OK));
    }, []);

    return (
        <div className="App">
            <header className="App-header">
                <img src={logo} className="App-logo" alt="logo" />
                <p>
                    Edit <code>src/App.js</code> and save to reload.
                </p>
                <a className="App-link" href="https://reactjs.org" target="_blank" rel="noopener noreferrer">
                    Learn React
                </a>
                <ul>
                    <li>{message}</li>
                </ul>
            </header>
        </div>
    );
}

export default App;
