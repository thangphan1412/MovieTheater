import React from 'react';
import Movie from './Movie';
import PictureFilm  from "../PictureFilm";
const UpcomingFilm = () => {
    return(
        <div className="container-fluid">
            <div>
                <a><h1>Phim Sắp Chiếu</h1></a>
                <a><h1>Phim Đang Chiếu </h1></a>
                <a><h1>Suất Chiếu Đặc Biệt </h1></a>
            </div>
            <PictureFilm/>

        </div>
    );

}
export default UpcomingFilm