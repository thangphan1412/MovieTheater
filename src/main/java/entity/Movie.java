package entity;

import jakarta.persistence.*;
import lombok.*;
import org.apache.catalina.User;

import java.util.Date;
import java.util.List;


@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "movie")
@ToString
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int movieId;
    private String title;
    private String director;
    private Date releaseDate;
    private String performer;
    private String category;
    private String country;
    private String language;
    private int duration;


    //showtime
    @OneToMany(mappedBy = "movie")
    private List<Showtime> showtimes;
}
