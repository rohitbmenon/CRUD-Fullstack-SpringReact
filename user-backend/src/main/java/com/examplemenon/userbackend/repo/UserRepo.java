package com.examplemenon.userbackend.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.examplemenon.userbackend.model.User;

public interface UserRepo extends JpaRepository<User, Long> {
    
}
