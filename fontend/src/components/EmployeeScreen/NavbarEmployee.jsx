import React from 'react';
import '../../assets/employeeNavbar.css'
import {useNavigate} from "react-router-dom";
const NavbarEmployee = () => {
    const navigate = useNavigate();

    return(
        <div className="navbar-employee">
            <div className="employee-button">
                <button onClick={()=> navigate()}>Home</button>
            </div>
            <div className="employee-button">
                <button onClick={()=> navigate()}>Movie</button>
            </div>
            <div className="employee-button">
                <button onClick={() => navigate()}>Payment</button>
            </div>
            <div className="employee-button">
                <button onClick={() => navigate()}>Cancel/Change</button>
            </div>
            <div className="employee-button">
                <button onClick={() => navigate()}>Ticket Sale</button>
            </div>
            <div className="employee-button">
                <button onClick={() => navigate()}>Return</button>
            </div>
        </div>
    )
}
export default NavbarEmployee