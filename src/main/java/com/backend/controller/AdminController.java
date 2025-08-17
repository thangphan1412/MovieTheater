package com.backend.controller;

import com.backend.dto.Theater.TheaterRequest;
import com.backend.dto.employeeDTO.EmployeeRequest;
import com.backend.dto.movieDTO.MovieRequest;
import com.backend.entity.Employee;
import com.backend.entity.Movie;
import com.backend.entity.Theater;
import com.backend.entity.User;
import com.backend.service.EmployeeService;
import com.backend.service.MovieDetailService;
import com.backend.service.ThreadService;
import com.backend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/api/admin")
public class AdminController {
    @Autowired
    private UserService userService;
    @Autowired
    private EmployeeService employeeService;

    @Autowired
    private MovieDetailService movieDetailService;
    @Autowired
    private ThreadService threadService;

    // lay user
    @GetMapping("/allUser")
    public List<User> getAllUsers() {
        return userService.findAll();
    }

    @GetMapping("/user/{id}")
    public Optional<User> getUserById(@PathVariable Long id) {
        return userService.findById(id);
    }


    //// lay nhan vien
    @GetMapping("/allEmployee")
    public List<Employee> getAllEmployees() {
        return employeeService.getAllEmployees();
    }
    @GetMapping("/employee/{id}")
    public Optional<Employee> getEmployeeById(@PathVariable Long id) {
        return employeeService.findById(id);
    }
    // tao nhan vien
    @PostMapping("/createEmployee")
    public ResponseEntity<Employee> createEmployee(@RequestBody EmployeeRequest request) {
        Employee savedEmployee = employeeService.create(request);
        return ResponseEntity.ok(savedEmployee);
    }
    // update thong tin
    @PutMapping("/update/{id}")
    public ResponseEntity<Employee> updateEmployee(@PathVariable Long id, @RequestBody EmployeeRequest request) {
        Optional<Employee> employee = employeeService.findById(id);
        if(employee.isEmpty()) {
            return ResponseEntity.notFound().build();
        }

        Employee updateEmployee = employeeService.updateEmployee(employee.get(),request);
        return ResponseEntity.ok(updateEmployee);
    }
    // xoa nhan vien
    @DeleteMapping("/delete/{id}")
    public void deleteEmployee(@PathVariable Long id) {
        Employee employee = getEmployeeById(id).get();
        employeeService.deteleEmployee(employee);
    }
    ///// CRUD phim
    // getAllMovie
    @GetMapping("/allMovie")
    public List<Movie> getAllMovies() {
        return movieDetailService.getAllMovieDetails();
    }
    @GetMapping("/movieDetail/{id}")
    public Optional<Movie> getMovieById(@PathVariable Long id) {
        return movieDetailService.getMovieDetailsByID(id);
    }
    // create movie
    @PostMapping("/createMovie")
    public ResponseEntity<Movie> createMovie(@RequestBody MovieRequest request) {
        Movie createMovie = movieDetailService.create(request);
        return ResponseEntity.ok(createMovie);
    }
    @PutMapping("/udpateMovie/{id}")
    public ResponseEntity<Movie> updateMovie(@PathVariable Long id, @RequestBody MovieRequest request) {
        Optional<Movie> movie = movieDetailService.getMovieDetailsByID(id);
        if(movie.isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        Movie updateMovie = movieDetailService.update(movie.get(), request);
        return ResponseEntity.ok(updateMovie);
    }

    ///// manage seat
    //CRUD theat
    @GetMapping("/allTheater")
    public List<Theater> getAllTheaters() {
        return threadService.getAllThreater();
    }
    @GetMapping("/getTheater/{id}")
    public Optional<Theater> getTheaterById(Long id){
        return threadService.getTheater(id);
    }


    @PostMapping("/createTheater")
    public ResponseEntity<Theater> createTheater(@RequestBody TheaterRequest request){
        Theater createTheater = threadService.create(request);
        return ResponseEntity.ok(createTheater);
    }
}
