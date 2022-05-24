package com.codeclan.example.foldersfilesusers.components;

import com.codeclan.example.foldersfilesusers.models.File;
import com.codeclan.example.foldersfilesusers.models.Folder;
import com.codeclan.example.foldersfilesusers.models.User;
import com.codeclan.example.foldersfilesusers.repositories.FileRepository;
import com.codeclan.example.foldersfilesusers.repositories.FolderRepository;
import com.codeclan.example.foldersfilesusers.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    FileRepository fileRepository;
    @Autowired
    FolderRepository folderRepository;
    @Autowired
    UserRepository userRepository;

    public DataLoader (){

    }

    public void run(ApplicationArguments args) {

        User user1 = new User("Kevin");
        userRepository.save(user1);
        Folder folder1 = new Folder("Important Files", user1);
        folderRepository.save(folder1);
        File file1 = new File("Resumes", "TXT", "100 Pages", folder1);
        fileRepository.save(file1);

        User user2 = new User("Bob");
        userRepository.save(user2);
        Folder folder2 = new Folder("Cool Files", user2);
        folderRepository.save(folder2);
        File file2 = new File("Amazing File", "EXE", "5 Pages", folder2);
        fileRepository.save(file2);

        folder1.addFiles(file1);
        folder1.addFiles(file2);
        folderRepository.save(folder1);

        user1.addFolders(folder1);
        user1.addFolders(folder2);
        userRepository.save(user1);

    }

}
