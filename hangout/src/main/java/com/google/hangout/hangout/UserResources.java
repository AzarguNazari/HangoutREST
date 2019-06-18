package com.google.hangout.hangout;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.google.hangout.Database.DatabaseClass;
import com.google.hangout.model.User;

@Path("/users")
public class UserResources {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<User> getAllUsers(){
		return DatabaseClass.
	}
	
	
}
