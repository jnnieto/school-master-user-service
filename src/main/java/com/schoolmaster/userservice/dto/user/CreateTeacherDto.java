package com.schoolmaster.userservice.dto.user;

import lombok.Data;

import javax.validation.constraints.NotEmpty;
import java.util.Date;

@Data
public class CreateTeacherDto {

    @NotEmpty
    private String area;

    @NotEmpty
    private String title;

    @NotEmpty
    private Date dateContract;

    @NotEmpty
    private Double salary;

    @NotEmpty
    private String specialty;

    @NotEmpty
    private String scheduleWork;

}
