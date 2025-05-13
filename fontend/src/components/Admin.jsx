import React from 'react';
import NavbarAdmin from "./AdminScreen/NavbarAdmin";
import InforUser from "./AdminScreen/InforUser";
import '../assets/admin.css'
import {useNavigate} from "react-router-dom";
const Admin = () =>{

    const navigate = useNavigate();
    return(
        <div className="admin-container">
            <h1>Trang quản lý</h1>
            <div className="information">
                <NavbarAdmin/>
                <InforUser/>
            </div>
        </div>
    );
}
export default Admin;