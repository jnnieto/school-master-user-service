package com.schoolmaster.userservice.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.UUID;

@Getter
@Setter
@Entity(name = "teachers")
public class Teacher {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(name = "area", length = 100, nullable = false)
    private String area;

    @Column(name = "title", length = 100, nullable = false)
    private String title;

    @Temporal(TemporalType.DATE)
    @Column(name = "date_contract", nullable = false)
    private Date dateContract;

    @Column(name = "salary", nullable = false)
    private Double salary;

    @Column(name = "specialty", length = 100, nullable = false)
    private String specialty;

    @Column(name = "schedule_work", length = 100)
    private String scheduleWork;

    @Column(name = "is_active")
    private Boolean isActive;

    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;

}
