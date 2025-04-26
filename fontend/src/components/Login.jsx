import Form from 'react-bootstrap/Form';
import React, {useState} from "react";
import Navbar from "./Navbar";
import {login} from "../api/login";

const Login = () => {
    const [username, setUsername] = useState('');
    const [password, setPassword] = useState('');

   const handleLogin = async (event) => {
       event.preventDefault();
       try {
           const data = await login(username, password); // gọi API
           console.log('Login thành công:', data);
           localStorage.setItem('token', data.token);
           // chuyển trang hoặc set state đăng nhập thành công nếu cần
       } catch (error) {
           console.error('Login thất bại:', error);
       }
   }
    return(
       <div>
           <Navbar/>

            <Form onSubmit={handleLogin}>
                <Form.Group className="mb-3" controlId="formGroupEmail">
                    <Form.Label>Email address</Form.Label>
                    <Form.Control type="email" placeholder="Enter email" name="email" value={username} onChange={(event) => setUsername(event.target.value)}/>
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