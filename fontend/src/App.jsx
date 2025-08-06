import React from 'react';
import {BrowserRouter as Router, Routes, Route} from 'react-router-dom';
import Header from "./components/header/Header";


function App() {
    return (
        <div>

        <Header/>
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
