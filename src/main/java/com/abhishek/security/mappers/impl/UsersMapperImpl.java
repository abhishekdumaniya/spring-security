package com.abhishek.security.mappers.impl;

import com.abhishek.security.domains.dtos.UsersDto;
import com.abhishek.security.domains.entities.Users;
import com.abhishek.security.mappers.UsersMapper;
import org.springframework.stereotype.Component;

@Component
public class UsersMapperImpl implements UsersMapper {

    @Override
    public Users fromDto(UsersDto dto) {

        return new Users(
                dto.getId(),
                dto.getUsername(),
                dto.getPassword()
        );
    }

    @Override
    public UsersDto toDto(Users users) {
       return new UsersDto(
               users.getId(),
               users.getUsername(),
               users.getPassword()
       );
    }
}
