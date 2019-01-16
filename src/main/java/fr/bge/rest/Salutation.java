package fr.bge.rest;

import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("/salutation")
public class Salutation {

	@POST
	public Response addition(@FormParam("nom") String nom) {
		String output = "Coucou " + nom;
		return Response.status(200).entity(output).build();
	}

}
