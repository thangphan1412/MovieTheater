import Form from 'react-bootstrap/Form';
import React, { useState } from "react";
import Navbar from "./Navbar";
import { login } from "../api/login";
import '../assets/login.css'
import {useNavigate} from "react-router-dom";

const Login = () => {
    const [email, setEmail] = useState('');
    const [password, setPassword] = useState('');
    const [message, setMessage] = useState('');

    const navigate = useNavigate();
    const handleLogin = async (event) => {
        event.preventDefault();
        try {
            const data = await login(email, password);
            console.log('Login thành công:', data);
            localStorage.setItem('token', data.token);
            setMessage('Login thành công');
            navigate('/');
        } catch (error) {
            console.error('Login thất bại:', error);
            setMessage('Login thất bại');
        }
    }

    return (
        <div>
            <Navbar />
            <div className="login-container">
                <div className="login-box">
                    <p>{message}</p>
                    <Form onSubmit={handleLogin}>
                        <Form.Group className="mb-3" controlId="formGroupEmail">
                            <Form.Label>Email address</Form.Label>
                            <Form.Control type="email" placeholder="Enter email" name="email" value={email} onChange={(event) => setEmail(event.target.value)} />
                        </Form.Group>
                        <Form.Group className="mb-3" controlId="formGroupPassword">
                            <Form.Label>Password</Form.Label>
                            <Form.Control type="password" placeholder="Password" name="password" value={password} onChange={(event) => setPassword(event.target.value)} />
                        </Form.Group>
                        <button type="submit" className="btn btn-primary w-100">Login</button>
                    </Form>
                </div>
            </div>
        </div>
    );
}

export default Login;
