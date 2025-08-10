import banner from '../../assets/img/3.jpg'
import Button from 'react-bootstrap/Button';
import Card from 'react-bootstrap/Card';
import '../../assets/css/componentCss/contentmainCss/maincontent.css'
import HeaderContent from "./HeaderContent";
export default function Maincontent(){
    return(
        <div className="mainContent">
            <HeaderContent/>
            <div className="content-container">
                <div className="item">
                    <Card style={{width: '18rem'}} className="content">
                        <img src={banner} className="imgcontent"/>
                        <Card.Body>
                            <Card.Title>Card Title</Card.Title>
                            <Card.Text>
                                Some quick example text to build on the card title and make up the
                                bulk of the card's content.
                            </Card.Text>
                            <Button variant="primary">Go somewhere</Button>
                        </Card.Body>


                    </Card>
                </div>
                <div className="item">
                    <Card style={{width: '18rem'}} className="content">
                        <img src={banner} className="imgcontent"/>
                        <Card.Body>
                            <Card.Title>Card Title</Card.Title>
                            <Card.Text>
                                Some quick example text to build on the card title and make up the
                                bulk of the card's content.
                            </Card.Text>
                            <Button variant="primary">Go somewhere</Button>
                        </Card.Body>


                    </Card>
                </div>
                <div className="item">
                    <Card style={{width: '18rem'}} className="content">
                        <img src={banner} className="imgcontent"/>
                        <Card.Body>
                            <Card.Title>Card Title</Card.Title>
                            <Card.Text>
                                Some quick example text to build on the card title and make up the
                                bulk of the card's content.
                            </Card.Text>
                            <Button variant="primary">Go somewhere</Button>
                        </Card.Body>


                    </Card>
                </div>
                <div className="item">
                    <Card style={{width: '18rem'}} className="content">
                        <img src={banner} className="imgcontent"/>
                        <Card.Body>
                            <Card.Title>Card Title</Card.Title>
                            <Card.Text>
                                Some quick example text to build on the card title and make up the
                                bulk of the card's content.
                            </Card.Text>
                            <Button variant="primary">Go somewhere</Button>
                        </Card.Body>


                    </Card>
                </div>
                <div className="item">
                    <Card style={{width: '18rem'}} className="content">
                        <img src={banner} className="imgcontent"/>
                        <Card.Body>
                            <Card.Title>Card Title</Card.Title>
                            <Card.Text>
                                Some quick example text to build on the card title and make up the
                                bulk of the card's content.
                            </Card.Text>
                            <Button variant="primary">Go somewhere</Button>
                        </Card.Body>


                    </Card>
                </div>
                <div className="item">
                    <Card style={{width: '18rem'}} className="content">
                        <img src={banner} className="imgcontent"/>
                        <Card.Body>
                            <Card.Title>Card Title</Card.Title>
                            <Card.Text>
                                Some quick example text to build on the card title and make up the
                                bulk of the card's content.
                            </Card.Text>
                            <Button variant="primary">Go somewhere</Button>
                        </Card.Body>


                    </Card>
                </div>
                <div className="item">
                    <Card style={{width: '18rem'}} className="content">
                        <img src={banner} className="imgcontent"/>
                        <Card.Body>
                            <Card.Title>Card Title</Card.Title>
                            <Card.Text>
                                Some quick example text to build on the card title and make up the
                                bulk of the card's content.
                            </Card.Text>
                            <Button variant="primary">Go somewhere</Button>
                        </Card.Body>


                    </Card>
                </div>
                <div className="item">
                    <Card style={{width: '18rem'}} className="content">
                        <img src={banner} className="imgcontent"/>
                        <Card.Body>
                            <Card.Title>Card Title</Card.Title>
                            <Card.Text>
                                Some quick example text to build on the card title and make up the
                                bulk of the card's content.
                            </Card.Text>
                            <Button variant="primary">Go somewhere</Button>
                        </Card.Body>


                    </Card>
                </div>
            </div>
        </div>


    );
}