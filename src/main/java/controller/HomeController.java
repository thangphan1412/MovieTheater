package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@Controller
public class HomeController {
    @GetMapping("/")
    public String home() {

        return "index";
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
