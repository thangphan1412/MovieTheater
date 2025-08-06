import Header from "../components/header/Header";
import "../assets/css/main.css"
import Footer from "../components/footer/Footer";
import Maincontent from "../components/mainContent/Maincontent";
export default function Home() {
    return(
    <div className="container">

            <Header/>


            <Maincontent/>

            <Footer/>

    </div>
    );

}