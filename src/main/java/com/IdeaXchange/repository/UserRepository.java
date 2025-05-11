package com.IdeaXchange.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.IdeaXchange.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
}