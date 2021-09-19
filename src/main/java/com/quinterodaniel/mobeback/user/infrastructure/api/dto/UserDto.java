package com.quinterodaniel.mobeback.user.infrastructure.api.dto;

import lombok.Data;

import java.util.UUID;

@Data
public class UserDto {
    private UUID id;
    private String email;
    private String password;
    private Boolean isAdmin;
}
