package com.google.hangout.Database;

import java.io.*;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.hangout.model.*;

public class DatabaseClass {

	private 
	
	
	private static Map<Long, User> users = new HashMap<>();
	private static Map<Long, Post> posts = new HashMap<>();
	private static Map<Long, Message> messages = new HashMap<>();

	static {
		try {

			File userFile = new File("user.db");
			File postFile = new File("post.db");
			File messageFile = new File("message.db");

			if (userFile.exists() && postFile.exists() && messageFile.exists()) {
				FileInputStream usersFileReader = new FileInputStream(userFile);
				FileInputStream postsFileReader = new FileInputStream(postFile);
				FileInputStream messagsesFileReader = new FileInputStream(messageFile);
				ObjectInputStream messagesObject = new ObjectInputStream(usersFileReader);
				ObjectInputStream usersObject = new ObjectInputStream(usersFileReader);
				ObjectInputStream postObject = new ObjectInputStream(postsFileReader);
				users = (Map<Long, User>) usersObject.readObject();
				posts = (Map<Long, Post>) postObject.readObject();
				messages = (Map<Long, Message>) messagesObject.readObject();
			} else {
				
				userFile.createNewFile();
				postFile.createNewFile();
				messageFile.createNewFile();
				
				List<User> newUsers = Arrays.asList(new User(1, "Hazargul", "Nazari"), new User(2, "Kamal", "Nazari"), new User(3, "Jamshid", "Nazari"));
				List<Message> newMessages = Arrays.asList(new Message(1, "Hello Everyone this is Hazargul"), new Message(2, "Hey This is Kamal"), new Message(3, "Jamshid is here"));
				List<Post> newPosts = Arrays.asList(new Post(1, "Post 1"), new Post(2, "Post 2"), new Post(3, "Post 3"));
			
				newUsers.forEach(u -> users.put(u.getId(), u));
				newMessages.forEach(m -> messages.put(m.getId(), m));
				newPosts.forEach(p -> posts.put(p.getId(), p));
			}

		} catch (ClassNotFoundException | IOException ex) {
			System.out.println("Error in loading the file : " + ex.getMessage());
		}

	}

	public static Map<Long, User> getUsers() {
		return users;
	}

	public static Map<Long, Post> getPosts() {
		return posts;
	}
	
	public static Map<Long, Message> getMessages(){
		return messages;
	}
}