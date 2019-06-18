package com.google.hangout.model;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Share implements Serializable{

	private static final long serialVersionID = 6L;
	private long id;
	private String person;
	
	public Share() {}
	
	public Share(long id, String person) {
		this.id = id;
		this.person = person;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getPerson() {
		return person;
	}

	public void setPerson(String person) {
		this.person = person;
	}
}