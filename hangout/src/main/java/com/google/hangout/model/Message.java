package com.google.hangout.model;

import java.io.Serializable;
import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Message implements Serializable{

	private static final long serialversionUID = 2L;
	private long id;
	private String message;
	private Date createdDate;
	
	public Message() {}
	
	public Message(long id, String message) {
		this.id = id;
		this.message = message;
		createdDate = new Date();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}