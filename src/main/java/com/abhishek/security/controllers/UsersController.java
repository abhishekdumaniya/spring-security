package com.abhishek.security.controllers;

import com.abhishek.security.domains.dtos.UsersDto;
import com.abhishek.security.domains.entities.Users;
import com.abhishek.security.services.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UsersController {

    @Autowired
    private UsersService service;


    @GetMapping(path = "/")
    public String greet(){
        return "Welcome Hacker";
    }

    @GetMapping(path = "/users")
    public ResponseEntity<List<Users>> getAllUsers(){
        return service.getAllUsers();
    }

    @PostMapping(path = "/login")
    public ResponseEntity<String> userLogin(){
        return ResponseEntity.ok("User login successfully");
    }

    @PostMapping(path = "/register")
    public ResponseEntity<String> userRegister(@RequestBody UsersDto usersDto){
        return service.userRegister(usersDto);
    }





}
