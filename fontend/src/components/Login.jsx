import Form from 'react-bootstrap/Form';
import React from "react";
import Navbar from "./Navbar";
import NavbarContent from "./Carousels/NavbarContent";
const Login = () => {
   return(
       <div>
           <Navbar/>

            <Form>
                <Form.Group className="mb-3" controlId="formGroupEmail">
                    <Form.Label>Email address</Form.Label>
                    <Form.Control type="email" placeholder="Enter email" />
                </Form.Group>
                <Form.Group className="mb-3" controlId="formGroupPassword">
                    <Form.Label>Password</Form.Label>
                    <Form.Control type="password" placeholder="Password" />
                </Form.Group>
            </Form>

       </div>
   )
}
export default Login;