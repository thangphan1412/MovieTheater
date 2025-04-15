package controller;

import entity.Movie;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;


@RestController
public class HomeController {
    private List<Movie> movies =new ArrayList<>();
    @GetMapping("/index")
    public List<Movie> home() {

        return movies;
    }
    @GetMapping("/login")
    public String login() {

        return "login";
    }
    @GetMapping("/register")
    public String register() {

        return "register";
    }


}
