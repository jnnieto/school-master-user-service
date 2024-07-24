package com.schoolmaster.userservice.controller;

import com.schoolmaster.userservice.dto.user.CreateUserDto;
import com.schoolmaster.userservice.dto.user.UpdateUserDto;
import com.schoolmaster.userservice.dto.user.UserDto;
import com.schoolmaster.userservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    public ResponseEntity<List<UserDto>> getAllUsers() {
        return ResponseEntity.ok(this.userService.getAllUsers());
    }

    @GetMapping("/{id}")
    public ResponseEntity<UserDto> getAllUsers(@PathVariable("id") UUID uuid) {
        return ResponseEntity.ok(this.userService.getUserById(uuid));
    }

    @PostMapping
    public ResponseEntity<CreateUserDto> createUser(@RequestBody CreateUserDto userDto) {
        return ResponseEntity.ok(this.userService.addUser(userDto));
    }

    @PutMapping("/{id}")
    public ResponseEntity<UpdateUserDto> updateUser(@RequestBody UpdateUserDto userDto) {
        return ResponseEntity.ok(this.userService.updateUser(userDto));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<UUID> deleteUser(@PathVariable("id") UUID uuid) {
        return ResponseEntity.ok(this.userService.deleteUserById(uuid));
    }

}
