package fr.bge.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("/v1/coucou")
public class CoucouV1 {

	@GET
	public Response testGet() {
		String output = "Coucou en v 1 !";
		return Response.status(200).entity(output).build();
	}

}
