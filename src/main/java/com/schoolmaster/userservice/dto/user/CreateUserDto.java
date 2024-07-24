package com.schoolmaster.userservice.dto.user;

import lombok.Data;

import javax.validation.Valid;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Data
public class CreateUserDto {

    @NotEmpty
    private String firstName;

    private String sencondName;

    @NotEmpty
    private String lastName;

    @NotEmpty
    private String sencondLastName;

    @NotEmpty
    @Email
    private String email;

    @NotEmpty
    @Size(min = 8, max = 40)
    private String password;

    @NotEmpty
    private String phone;

    @NotEmpty
    private String address;

    @NotEmpty
    private String city;

    @NotEmpty
    private String country;

    @Valid
    private CreateStudentDto student;

    @Valid
    private CreateTeacherDto teacher;

}
