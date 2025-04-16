import React from 'react';
import Navbar from "./components/Navbar";
import Footer from "./components/Footer";
import PictureFilm from "./components/PictureFilm";
import Carousels from "./components/Carousels/Carousels";
function App(){
    return(
        <header className="Header">
            <Navbar/>
            <Carousels/>
                <PictureFilm/>

            <Footer/>
        </header>
    );
}

export default App