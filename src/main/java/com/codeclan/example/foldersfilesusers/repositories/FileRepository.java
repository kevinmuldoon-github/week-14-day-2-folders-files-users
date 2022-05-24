package com.codeclan.example.foldersfilesusers.repositories;

import com.codeclan.example.foldersfilesusers.models.File;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FileRepository extends JpaRepository<File, Long> {
}
