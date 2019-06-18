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
	
	
	
}