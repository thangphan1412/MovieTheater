import '../assets/pictureFilm.css'
import ButtonByTick from "./ButtonByTick/Button";
const PictureFilm = () => {
    const movie= [
        { id: 1, title: "Phim 1", image: "linkảnh1" },
        { id: 2, title: "Phim 2", image: "linkảnh2" },
        { id: 3, title: "Phim 3", image: "linkảnh3" },
        { id: 4, title: "Phim 4", image: "linkảnh4" },
    ];
    return(
        <div className="gird-container">
            {movie.map(movie=> (
                <div className="col" key={movie.id}>col1
                    <img src={movie.image}/>
                    <h3>{movie.title}</h3>
                    <ButtonByTick moviedId={movie.id}/>
                </div>
            ))}

        </div>
    );
}

export default PictureFilm;