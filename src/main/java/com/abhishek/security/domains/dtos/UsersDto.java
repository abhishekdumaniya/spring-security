package com.abhishek.security.domains.dtos;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class UsersDto {
    private Long id;
    private String username;
    private String password;
}
