package reponsitory;

import entity.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Repository
public interface MovieDetailRepository extends JpaRepository<Movie, Long>{
}
