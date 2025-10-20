package com.backend.controller;

import com.backend.dto.Theater.TheaterRequest;
import com.backend.dto.employeeDTO.EmployeeRequest;
import com.backend.dto.employeeDTO.EmployeeResponse;
import com.backend.dto.movieDTO.MovieResponse;
import com.backend.dto.movieDTO.MovieRequest;
import com.backend.dto.userDTO.UserResponse;
import com.backend.entity.Employee;
import com.backend.entity.Movie;
import com.backend.entity.Theater;
import com.backend.entity.User;
import com.backend.service.EmployeeService;
import com.backend.service.MovieDetailService;
import com.backend.service.ThreadService;
import com.backend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;
import java.util.UUID;


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
    public ResponseEntity<List<UserResponse>> getAllUser(){
        return ResponseEntity.ok().body(userService.findAllUser());
    }

    @GetMapping("/user/{id}")
    public Optional<User> getUserById(@PathVariable UUID id) {
        return userService.findById(id);
    }


    //// lay nhan vien
    @GetMapping("/allEmployee")
    public List<Employee> getAllEmployees() {
        return employeeService.getAllEmployees();
    }
    @GetMapping("/employee/{id}")
    public Optional<Employee> getEmployeeById(@PathVariable UUID id) {
        return employeeService.findById(id);
    }
    // tao nhan vien
    @PostMapping
    public ResponseEntity<EmployeeResponse> create(@RequestBody EmployeeRequest request) {
        EmployeeResponse response = employeeService.create(request);
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }
    // update thong tin
    @PutMapping("/update/{id}")
    public ResponseEntity<Employee> updateEmployee(@PathVariable UUID id, @RequestBody EmployeeRequest request) {
        Optional<Employee> employee = employeeService.findById(id);
        if(employee.isEmpty()) {
            return ResponseEntity.notFound().build();
        }

        Employee updateEmployee = employeeService.updateEmployee(employee.get(),request);
        return ResponseEntity.ok(updateEmployee);
    }
    // xoa nhan vien
    @DeleteMapping("/delete/{id}")
    public void deleteEmployee(@PathVariable UUID id) {
        Employee employee = getEmployeeById(id).get();
        employeeService.deteleEmployee(employee);
    }
    ///// CRUD phim
    // create movie
    @PostMapping("/CreateMovie")
    public ResponseEntity<?> createMovie(@RequestBody MovieRequest movieRequest){
        try{
            MovieResponse movieReponse = movieDetailService.create(movieRequest);
            return ResponseEntity.status(HttpStatus.CREATED).body(movieReponse);
        } catch (RuntimeException e){
            return ResponseEntity.badRequest().body(e.getMessage());
        }

    }
    @GetMapping("/movie/{id}")
    public ResponseEntity<MovieResponse> getMovieById(@PathVariable UUID id){
        MovieResponse movieResponse = movieDetailService.getMovieDetailsByID(id);
        return ResponseEntity.status(HttpStatus.OK).body(movieResponse);
    }

    @PutMapping("/udpateMovie/{id}")
    public ResponseEntity<MovieResponse> updateMovie(@PathVariable UUID id, @RequestBody MovieRequest request) {
        MovieResponse movieResponse = movieDetailService.update(id, request);
        return ResponseEntity.ok(movieResponse);
    }

    ///// manage seat
    //CRUD theat
    @GetMapping("/allTheater")
    public List<Theater> getAllTheaters() {
        return threadService.getAllThreater();
    }
    @GetMapping("/getTheater/{id}")
    public Optional<Theater> getTheaterById(UUID id){
        return threadService.getTheater(id);
    }


    @PostMapping("/createTheater")
    public ResponseEntity<Theater> createTheater(@RequestBody TheaterRequest request){
        Theater createTheater = threadService.create(request);
        return ResponseEntity.ok(createTheater);
    }
}
