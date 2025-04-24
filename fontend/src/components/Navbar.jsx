import '../assets/navbar.css';
import {Link, useNavigate} from 'react-router-dom';
import React from "react";
import NavbarContent from "./Carousels/NavbarContent";


const Navbar = () => {
    const navigate = useNavigate();
    return (
        <div>
            <div className="navbar_main">
                <button  onClick={() => navigate("/login")}>Đăng nhập</button>
                <button  onClick={() => navigate("/register")}>Register</button>
            </div>
            <NavbarContent/>
        </div>
    );
}

export default Navbar;
