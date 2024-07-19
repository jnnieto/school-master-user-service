package com.schoolmaster.userservice.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@Entity(name = "roles")
public class Rol {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(name = "name", unique = true, length = 16, nullable = false)
    private String name;

    @Column(name = "is_active")
    private Boolean isActive;

}
