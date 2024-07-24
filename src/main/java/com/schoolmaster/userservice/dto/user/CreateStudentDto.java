package com.schoolmaster.userservice.dto.user;

import lombok.Data;

import javax.validation.constraints.NotEmpty;
import java.util.Calendar;
import java.util.Date;

@Data
public class CreateStudentDto {

    @NotEmpty
    private Calendar birthDate;

    @NotEmpty
    private Date inscriptionDate;

}
