package com.google.hangout.Database;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

import com.google.hangout.model.*;

public class DatabaseClass {

	private static Map<Long, User> users = new HashMap<>();
	private static Map<Long, Post> posts = new HashMap<>();

	static {
		try {
			
			File userFile = new File("user.db");
			File postFile = new File("post.db");
			
			if (!userFile.exists()) {
				userFile.createNewFile();
			}
			
			if (!postFile.exists()) {
				postFile.createNewFile();
			}
			
			FileInputStream usersFileReader = new FileInputStream(userFile);
			FileInputStream postsFileReader = new FileInputStream(postFile);
			ObjectInputStream usersObject = new ObjectInputStream(usersFileReader);
			ObjectInputStream obInput = new ObjectInputStream(usersFileReader);
			
			users = (Map<Long, User>) obInput.readObject();
			
		} catch (ClassNotFoundException | IOException ex) {
			System.out.println("Error in loading the file : " + ex.getMessage());
		}

	}

	private static Map<Long, User> getUsers(){
		return users;
	}
	
	private static Map<Long, Post> getPosts(){
		return posts;
	}
}
