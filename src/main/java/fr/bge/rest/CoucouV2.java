package fr.bge.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("/v2/coucou")
public class CoucouV2 {

	@GET
	public Response testGet() {
		String output = "Coucou en v 2 !";
		return Response.status(200).entity(output).build();
	}

}
