package com.schoolmaster.userservice.repository;

import com.schoolmaster.userservice.entity.User;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface UserRepository extends CrudRepository<User, UUID> {
}
