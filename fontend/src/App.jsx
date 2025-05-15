import React from 'react';
import {BrowserRouter as Router, Routes, Route} from 'react-router-dom';
import Login from "./components/Login";
import Register from "./components/Register";
import Home from "./components/Home";
import Admin from "./components/Admin";
import Employee from "./components/Employee";

function App() {
    return (
        <Router>
            <div className="">
                <Routes>
                    <Route path="/" element={<Home />} />
                    <Route path="/home" element={<Home />} />
                    <Route path="/login" element={<Login />} />
                    <Route path="/register" element={<Register />} />
                    <Route path={"admin"} element={<Admin/>}/>
                    <Route path={"/employee"} element={<Employee/>} />
                </Routes>
            </div>
        </Router>
    );
}

export default App;
