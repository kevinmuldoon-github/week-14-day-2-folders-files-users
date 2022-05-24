package com.codeclan.example.foldersfilesusers;

import com.codeclan.example.foldersfilesusers.models.File;
import com.codeclan.example.foldersfilesusers.models.Folder;
import com.codeclan.example.foldersfilesusers.models.User;
import com.codeclan.example.foldersfilesusers.repositories.FileRepository;
import com.codeclan.example.foldersfilesusers.repositories.FolderRepository;
import com.codeclan.example.foldersfilesusers.repositories.UserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FoldersFilesUsersApplicationTests {

	@Autowired
	FileRepository fileRepository;
	@Autowired
	FolderRepository folderRepository;
	@Autowired
	UserRepository userRepository;

	@Test
	public void contextLoads() {
	}

	@Test
	public void createEverything(){

	}

}
