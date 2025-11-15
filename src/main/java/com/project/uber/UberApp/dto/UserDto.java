package com.project.uber.UberApp.dto;

import com.project.uber.UberApp.entities.enums.UserRole;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {

    private String name, email;

    private Set<UserRole> roles;
}
