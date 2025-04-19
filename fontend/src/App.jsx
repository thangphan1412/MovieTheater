import React from 'react';
import { BrowserRouter as Router, Routes, Route } from 'react-router-dom';

import Navbar from "./components/Navbar";
import Footer from "./components/Footer";
import PictureFilm from "./components/PictureFilm";
import Carousels from "./components/Carousels/Carousels";
import Register from "./pages/register/Register";

function App() {
    return (
        <Router>
            <div className="Header">
                <Navbar />

                <Routes>
                    {/* Trabg chủ */}
                    <Route path="/" element={
                        <>
                            <Carousels />
                            <PictureFilm />
                        </>
                    } />

                    {/* Trang đăng ký */}
                    <Route path="/register" element={<Register />} />
                </Routes>

                <Footer />
            </div>
        </Router>
    );
}

export default App;
