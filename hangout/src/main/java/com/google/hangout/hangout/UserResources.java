package com.google.hangout.hangout;

import java.util.Arrays;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.google.hangout.Database.DatabaseClass;
import com.google.hangout.model.User;

@Path("/users")
public class UserResources {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<User> getAllUsers(){
		return (List<User>) DatabaseClass.getUsers().values();
	}
	
	@GET
	@Path("/{userId}")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public User getUser(@PathParam("userId") long userid) {
		return DatabaseClass.getUsers().get(userid);
	}
}
