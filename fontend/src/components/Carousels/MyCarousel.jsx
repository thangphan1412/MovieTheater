import Carousel from 'react-bootstrap/Carousel';
import poster from '../img/1.jpg'
function MyCarousel(){
    return (
        <Carousel>
            <Carousel.Item>
                <img
                    className="d-block w-100"
                    src={poster}
                    alt="First slide"
                />
            </Carousel.Item>


        </Carousel>
    );
}
export default MyCarousel