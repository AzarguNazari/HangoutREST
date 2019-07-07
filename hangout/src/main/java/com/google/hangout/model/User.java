package com.google.hangout.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class User implements Serializable{

	private static final long serialversionUID = 1L;
	private long id;
	private String firstname;
	private String lastname;
	private Date createdDate;
	private List<Long> friends;
	private List<Long> messages;
	private List<Long> posts;
	
	public User() {}
	
	public User(long id, String firstname, String lastname) {
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		friends = new ArrayList<>();
		messages = new ArrayList<>();
		posts = new ArrayList<>();
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public Date getCreatedDate() {
		return createdDate;
	}
	
	public List<Long> getFriends() {
		return friends;
	}

	public List<Long> getMessages() {
		return messages;
	}

	public List<Long> getPosts() {
		return posts;
	}

	
}
