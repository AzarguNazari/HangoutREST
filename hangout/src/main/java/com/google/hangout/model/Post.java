package com.google.hangout.model;

import java.io.Serializable;
import java.util.*;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Post implements Serializable{
	
	private static final long serialVersionID = 3L;
	private long id;
	private String content;
	private Date createdDate;
	private List<Comment> comments;
	private List<Like> likes;
	private List<Share> shares;
	
	public Post() {}

	public Post(long id, String content) {
		this.id = id;
		this.content = content;
		comments = new ArrayList<>();
		likes = new ArrayList<>();
		shares = new ArrayList<>();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
	
}
