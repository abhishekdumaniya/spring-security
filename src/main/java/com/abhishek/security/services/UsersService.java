package com.abhishek.security.services;

import com.abhishek.security.domains.dtos.UsersDto;
import com.abhishek.security.domains.entities.Users;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface UsersService {
    ResponseEntity<String> userRegister(UsersDto usersDto);
    ResponseEntity<List<Users>> getAllUsers();
}
