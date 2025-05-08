import React from 'react';
import NavbarAdmin from "./AdminScreen/NavbarAdmin";
import InforMain from "./AdminScreen/InforMain";
import '../assets/admin.css'
const Admin = () =>{

    return(
        <div className="admin-container">
            <h1>Admin Page</h1>
            <div className="information">
                <NavbarAdmin/>
                <InforMain/>
            </div>
        </div>
    );
}
export default Admin;