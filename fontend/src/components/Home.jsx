
import React from "react";
import Navbar from "./Navbar";
import Carousels from "./Carousels/Carousels";

import Footer from "./Footer";
import PictureFilm from "./PictureFilm";



const Home = () => {
    return (
      <div>
          <Navbar/>
          <Carousels/>
          <PictureFilm/>
          <Footer/>

      </div>
    );
}
export default Home;