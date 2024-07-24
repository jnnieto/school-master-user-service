package com.schoolmaster.userservice.service;

import com.schoolmaster.userservice.dto.user.CreateUserDto;
import com.schoolmaster.userservice.dto.user.UpdateUserDto;
import com.schoolmaster.userservice.dto.user.UserDto;

import java.util.List;
import java.util.UUID;

public interface UserService {

    List<UserDto> getAllUsers();

    UserDto getUserById(UUID id);

    UserDto getUserByEmail(String email);

    CreateUserDto addUser(CreateUserDto createUserDto);

    UpdateUserDto updateUser(UpdateUserDto updateUserDto);

    UUID deleteUserById(UUID id);

}
