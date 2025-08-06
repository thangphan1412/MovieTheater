import React from 'react';
import Container from 'react-bootstrap/Container';
import Nav from 'react-bootstrap/Nav';
import Navbar from 'react-bootstrap/Navbar';
import "../../assets/css/componentCss/headerCss/headerContent2.css"
export default function HeaderContent2() {
    return(
        <Navbar expand="lg" className="bg-body-tertiary">
            <Container>
                <div className="nav-grid">
                    <Navbar.Brand id="basic-navber-nav1" href="#home">MovieTheater</Navbar.Brand>
                    <Navbar.Collapse id="basic-navbar-nav2">
                        <Nav>
                            <Nav.Link className="item" href="#home">Home</Nav.Link>
                            <Nav.Link className="item" href="#link">Phim</Nav.Link>
                            <Nav.Link className="item" href="#link">Giá vé</Nav.Link>
                            <Nav.Link className="item" href="#link">Tin mới</Nav.Link>
                        </Nav>
                    </Navbar.Collapse>


                </div>
            </Container>
        </Navbar>

    );
}