package com.runningfun.coffeelist.backend.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

@Path("/hello")
public class HelloWorldEndpoint {

	@GET
	@Produces("text/plain")
	public Response doGet() {
		return Response.ok("Hello from WildFly Swarm!").build();
	}

	@GET
	@Produces("text/plain")
	@Path("secured")
	public Response getSecuredResource() {
		return Response.ok("Hello from secured resource!").build();
	}
}