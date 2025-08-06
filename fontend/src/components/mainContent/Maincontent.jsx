import banner from '../../assets/img/3.jpg'
import Button from 'react-bootstrap/Button';
import Card from 'react-bootstrap/Card';
export default function Maincontent(){
    return(
        <div>
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
    );
}