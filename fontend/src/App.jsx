import React from 'react';
import {BrowserRouter as Router, Routes, Route, BrowserRouter} from 'react-router-dom';
import Header from "./components/header/Header";
import Home from "./pages/Home";
import Login from "./features/auth/Login";
import Register from "./features/auth/Register";


function App() {
    return (
        <div >
            <BrowserRouter>
                <Routes>
                    <Route path="/" element={<Home/>}/>
                    <Route path={"/login"} element={<Login/>}/>
                    <Route path={"/register"} element={<Register/>}/>
                </Routes>
            </BrowserRouter>

        </div>
    );
}
// <Router>
//     <div className="">
//         <Routes>
//             <Route path="/" element={<Home />} />
//             <Route path="/home" element={<Home />} />
//             <Route path="/login" element={<Login />} />
//             <Route path="/register" element={<Register />} />
//             <Route path={"admin"} element={<Admin/>}/>
//             <Route path={"/employee"} element={<Employee/>} />
//         </Routes>
//     </div>
// </Router>
export default App;
