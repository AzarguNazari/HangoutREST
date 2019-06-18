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
	private List<User> friends;
	private List<Message> messages;
	
	public User() {}
	
	public User(long id, String firstname, String lastname) {
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		friends = new ArrayList<>();
		messages = new ArrayList<>();
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
	
	public List<User> getFriends() {
		return friends;
	}
	
}
