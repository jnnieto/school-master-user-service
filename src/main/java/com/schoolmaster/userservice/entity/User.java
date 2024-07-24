package com.schoolmaster.userservice.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.UUID;

@Getter
@Setter
@Entity(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(name = "first_name", nullable = false, length = 64)
    private String firstName;

    @Column(name = "sencond_name", length = 64)
    private String sencondName;

    @Column(name = "last_name", nullable = false, length = 64)
    private String lastName;

    @Column(name = "sencond_last_name", nullable = false, length = 64)
    private String sencondLastName;

    @Column(name = "email", unique = true, nullable = false, length = 64)
    private String email;

    @Column(name = "password", unique = true, nullable = false)
    private String password;

    @Column(name = "phone", nullable = false, length = 64)
    private String phone;

    @Column(name = "address", nullable = false, length = 64)
    private String address;

    @Column(name = "city", nullable = false, length = 64)
    private String city;

    @Column(name = "country", nullable = false, length = 64)
    private String country;

    @Column(name = "creation_date", updatable = false, nullable = false)
    @Temporal(TemporalType.DATE)
    private Date creationDate;

    @Column(name = "modification_date")
    @Temporal(TemporalType.DATE)
    private Date modificationDate;

    @Column(name = "is_active")
    private Boolean isActive;

    @ManyToOne(optional = false, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Rol rol;

    @OneToOne(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
    private Student student;

    @OneToOne(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
    private Teacher teacher;

}
