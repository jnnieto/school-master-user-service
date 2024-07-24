package com.schoolmaster.userservice.service.impl;

import com.schoolmaster.userservice.dto.user.CreateUserDto;
import com.schoolmaster.userservice.dto.user.UpdateUserDto;
import com.schoolmaster.userservice.dto.user.UserDto;
import com.schoolmaster.userservice.repository.UserRepository;
import com.schoolmaster.userservice.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<UserDto> getAllUsers() {
        System.out.println("Hola");
        return List.of();
    }

    @Override
    public UserDto getUserById(UUID id) {
        return null;
    }

    @Override
    public UserDto getUserByEmail(String email) {
        return null;
    }

    @Override
    public CreateUserDto addUser(CreateUserDto createUserDto) {
        return null;
    }

    @Override
    public UpdateUserDto updateUser(UpdateUserDto updateUserDto) {
        return null;
    }

    @Override
    public UUID deleteUserById(UUID id) {
        return null;
    }
}
