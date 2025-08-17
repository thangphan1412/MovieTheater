import React from 'react';
import "../../assets/css/fearuresCss/authCss/login.css"
import {loginApi} from "../../services/auth/loginApi"
export default function Login(){
    const [email, setEmail] = React.useState('');
    const [password, setPassword] = React.useState('');
    const [message, setMessage] = React.useState('');
    //async la 1 tu khoa dung truoc ham khien ham do tra ve 1 gia trij(loi hua)
    const handleSubmit = async (e) => {
        e.preventDefault();
        try{
            const result = await loginApi(email, password);
            setMessage("dang nhap thanh cong");
            console.log(result);
        } catch (err){
            setMessage("dang nhap that bai");
            console.log(err);
        }
    }
    return(

        <div className="login-container">
            <form action="" onSubmit={handleSubmit}>
                <h2>Email</h2>
                <input type="email"   onChange={(e) => setEmail(e.target.value)}></input>
                <h2>Password</h2>
                <input type="password"   onChange={(e) => setPassword(e.target.value)}></input>
                <button type="submit" value={email}>Login</button>
                {/*<button type="submit" value={password}>Register</button>*/}
                <p>{message}</p>
            </form>
        </div>
    );
}