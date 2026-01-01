package com.abhishek.security.mappers;

import com.abhishek.security.domains.dtos.UsersDto;
import com.abhishek.security.domains.entities.Users;

public interface UsersMapper {
    Users fromDto(UsersDto dto);
    UsersDto toDto(Users users);
}
