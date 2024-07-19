package com.schoolmaster.userservice.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;
import java.util.UUID;

@Getter
@Setter
@Entity(name = "students")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(name = "birth_date", updatable = false, nullable = false)
    @Temporal(TemporalType.DATE)
    private Calendar birthDate;

    @Column(name = "inscription_date", updatable = false, nullable = false)
    @Temporal(TemporalType.DATE)
    private Date inscriptionDate;

    @Column(name = "is_active")
    private Boolean isActive;

    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;

}
