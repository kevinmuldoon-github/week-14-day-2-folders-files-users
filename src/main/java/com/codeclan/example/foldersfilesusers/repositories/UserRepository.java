package com.codeclan.example.foldersfilesusers.repositories;

import com.codeclan.example.foldersfilesusers.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
