import Form from 'react-bootstrap/Form';
import React, {useState} from "react";
import Navbar from "./Navbar";
import {login} from "../api/login";

const Login = () => {
    const [email, setEmail] = useState('');
    const [password, setPassword] = useState('');

    const [message, setMessage] = useState('');
   const handleLogin = async (event) => {
       event.preventDefault();
       try {
           const data = await login(email, password); // gọi API
           console.log('Login thành công:', data);
           localStorage.setItem('token', data.token);
           setMessage('login thanh cong');
           // chuyển trang hoặc set state đăng nhập thành công nếu cần
       } catch (error) {
           console.error('Login thất bại:', error);
           setMessage('login that bai');
       }
   }
    return(
       <div>
           <Navbar/>
            <p>{message}</p>
            <Form onSubmit={handleLogin}>
                <Form.Group className="mb-3" controlId="formGroupEmail">
                    <Form.Label>Email address</Form.Label>
                    <Form.Control type="email" placeholder="Enter email" name="email" value={email} onChange={(event) => setEmail(event.target.value)}/>
                </Form.Group>
                <Form.Group className="mb-3" controlId="formGroupPassword">
                    <Form.Label>Password</Form.Label>
                    <Form.Control type="password" placeholder="Password" name="password" value={password} onChange={(event) => setPassword(event.target.value)} />
                </Form.Group>
                <button type="submit">Login</button>
            </Form>

       </div>
   )
}
export default Login;