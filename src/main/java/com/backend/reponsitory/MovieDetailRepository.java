package com.backend.reponsitory;

import com.backend.entity.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public interface MovieDetailRepository extends JpaRepository<Movie, UUID>{
    boolean existsAllByTitle(String title);

}
