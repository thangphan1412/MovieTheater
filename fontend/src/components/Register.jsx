import Col from 'react-bootstrap/Col';
import Form from 'react-bootstrap/Form';
import Row from 'react-bootstrap/Row';
import Button from 'react-bootstrap/Button';
import '../assets/register.css';
import Navbar from "./Navbar";
import NavbarContent from "./Carousels/NavbarContent";
import {useState} from "react";
import {register} from "../api/register";

const Register = () => {
    //
    const [formData, setFormData] = useState({
        email:'',
        password: '',
        firstName:'',
        lastName:'',
        userName:'',
        phoneNumber:''
    });
    const [message, setMessage] = useState('');

    const handleChange = (e) =>{
        setFormData({...formData, [e.target.name]: e.target.value})
    };
    const handleSubmit = async (e) =>{
        e.preventDefault();
        try{
            const data = await register(formData);
            console.log('Register success:', data);
            setMessage('Dang ky thanh cong');
        } catch (error){
            console.error('Register error');
            setMessage('Dang ky that bai');
        }
    }
    //
    return (
        <div>
            <Navbar/>
            <p>{message}</p>
            <div className="form-container">

                <Form className="register-form" onSubmit={handleSubmit}>
                    <Row className="mb-3">
                        <Form.Group as={Col} controlId="formEmail">
                            <Form.Label>Email</Form.Label>
                            <Form.Control type="email" placeholder="Enter email" name="email" value={formData.email}
                                          onChange={handleChange}/>
                        </Form.Group>

                        <Form.Group as={Col} controlId="formPassword">
                            <Form.Label>Password</Form.Label>
                            <Form.Control type="password" placeholder="Password" name="password"
                                          value={formData.password} onChange={handleChange}/>
                        </Form.Group>
                    </Row>

                    <Row className="mb-3">
                        <Form.Group as={Col} controlId="formFirstName">
                            <Form.Label>First Name</Form.Label>
                            <Form.Control type="text" placeholder="First name" name="firstName"
                                          value={formData.firstName} onChange={handleChange}/>
                        </Form.Group>

                        <Form.Group as={Col} controlId="formLastName">
                            <Form.Label>Last Name</Form.Label>
                            <Form.Control type="text" placeholder="Last name" name="lastName" value={formData.lastName}
                                          onChange={handleChange}/>
                        </Form.Group>
                    </Row>

                    <Row className="mb-3">
                        <Form.Group as={Col} controlId="formUsername">
                            <Form.Label>Username</Form.Label>
                            <Form.Control type="text" placeholder="Username" name="userName" value={formData.userName}
                                          onChange={handleChange}/>
                        </Form.Group>

                        <Form.Group as={Col} controlId="formPhone">
                            <Form.Label>Phone Number</Form.Label>
                            <Form.Control type="tel" placeholder="Phone number" name="phoneNumber"
                                          value={formData.phoneNumber} onChange={handleChange}/>
                        </Form.Group>
                    </Row>

                    <div className="text-center">
                        <Button type="submit">Submit</Button>
                    </div>
                </Form>

            </div>
        </div>

    );
}

export default Register;
