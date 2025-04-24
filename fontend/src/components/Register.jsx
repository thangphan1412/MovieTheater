import Col from 'react-bootstrap/Col';
import Form from 'react-bootstrap/Form';
import Row from 'react-bootstrap/Row';
import Button from 'react-bootstrap/Button';
import '../assets/register.css';
import Navbar from "./Navbar";
import NavbarContent from "./Carousels/NavbarContent";

const Register = () => {
    return (
        <div>
            <Navbar/>
            <div className="form-container">

                <Form className="register-form">
                    <Row className="mb-3">
                        <Form.Group as={Col} controlId="formEmail">
                            <Form.Label>Email</Form.Label>
                            <Form.Control type="email" placeholder="Enter email"/>
                        </Form.Group>

                        <Form.Group as={Col} controlId="formPassword">
                            <Form.Label>Password</Form.Label>
                            <Form.Control type="password" placeholder="Password"/>
                        </Form.Group>
                    </Row>

                    <Row className="mb-3">
                        <Form.Group as={Col} controlId="formFirstName">
                            <Form.Label>First Name</Form.Label>
                            <Form.Control type="text" placeholder="First name"/>
                        </Form.Group>

                        <Form.Group as={Col} controlId="formLastName">
                            <Form.Label>Last Name</Form.Label>
                            <Form.Control type="text" placeholder="Last name"/>
                        </Form.Group>
                    </Row>

                    <Row className="mb-3">
                        <Form.Group as={Col} controlId="formUsername">
                            <Form.Label>Username</Form.Label>
                            <Form.Control type="text" placeholder="Username"/>
                        </Form.Group>

                        <Form.Group as={Col} controlId="formPhone">
                            <Form.Label>Phone Number</Form.Label>
                            <Form.Control type="tel" placeholder="Phone number"/>
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
