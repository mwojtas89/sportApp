package com.akvelon.sport.domain.dto;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;

import javax.persistence.Column;

@Getter
@AllArgsConstructor
public class UserDto {
    private Long id;
    private String name;
    private String lastName;
    private String password;
    private String email;
    private String location;
    private String image;
}
