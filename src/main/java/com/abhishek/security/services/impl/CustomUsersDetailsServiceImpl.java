package com.abhishek.security.services.impl;

import com.abhishek.security.domains.entities.Users;
import com.abhishek.security.domains.entities.UsersPrincipal;
import com.abhishek.security.repositories.UsersRepository;
import com.abhishek.security.services.CustomUsersDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class CustomUsersDetailsServiceImpl implements CustomUsersDetailsService {

    @Autowired
    private UsersRepository repository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Users users = repository.findByUsername(username);
        if (users == null){
            System.out.println("User not found with this username");
            throw new UsernameNotFoundException("User not found with this username");
        }
        return new UsersPrincipal(users);
    }
}
