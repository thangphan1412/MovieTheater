package org.example.movietheater;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = {"entity"})
public class MovieTheaterApplication {

    public static void main(String[] args) {
        SpringApplication.run(MovieTheaterApplication.class, args);


        
    }


}

