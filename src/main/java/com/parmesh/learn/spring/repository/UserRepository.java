package com.parmesh.learn.spring.repository;

import com.parmesh.learn.spring.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public  interface UserRepository extends JpaRepository<User,Long> {


    Optional<User> findByUsername(String username);

    boolean existsByUsername(String username);
}