package com.google.hangout.model;

import java.io.Serializable;
import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Comment implements Serializable{

	private static final long serialVersionID = 4L;
	private long id;
	private String comment;
	private String author;
	private Date created;
	
	public Comment() {}
	
	public Comment(long id, String comment, String author) {
		this.id = id;
		this.comment = comment;
		this.author = author;
		created = new Date();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
}
