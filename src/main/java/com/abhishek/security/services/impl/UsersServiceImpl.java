package com.abhishek.security.services.impl;

import com.abhishek.security.domains.dtos.UsersDto;
import com.abhishek.security.domains.entities.Users;
import com.abhishek.security.mappers.UsersMapper;
import com.abhishek.security.repositories.UsersRepository;
import com.abhishek.security.services.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsersServiceImpl implements UsersService {

    @Autowired
    private UsersRepository repository;

    @Autowired
    private UsersMapper mapper;


    BCryptPasswordEncoder encoder = new BCryptPasswordEncoder(12);

    @Override
    public ResponseEntity<String> userRegister(UsersDto usersDto) {
        Users users = mapper.fromDto(usersDto);
        users.setPassword(encoder.encode(users.getPassword()));
        repository.save(users);
        return ResponseEntity.ok("User Register successfully");
    }


    @Override
    public ResponseEntity<List<Users>> getAllUsers() {
        List<Users> users = repository.findAll();
        return new ResponseEntity<>(users, HttpStatus.OK);
    }
}
