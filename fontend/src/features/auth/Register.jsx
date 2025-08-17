import React from 'react';
import "../../assets/css/fearuresCss/authCss/register.css"
export default function Register(){
    return(
        <div className="register-container">
            <form action="">
                <input type="text">email</input>
                <input type="text">fist name</input>
                <input type="text">last name</input>
                <input type="text">number phone</input>
                <input type="text">password</input>
                <button type="submit">remember me</button>
                <button type="submit">Register</button>
            </form>
        </div>
    );
}