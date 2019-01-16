package fr.bge.rest;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import fr.bge.domaine.Personne;

@Path("/list")
public class Groupe {

	@GET
	@Path("/beatles")
	@Produces("application/json")
	public Response getBeatles() {
		List < Personne > resultat = new ArrayList <>();
		resultat.add(new Personne("Starr", "Ringo"));
		resultat.add(new Personne("Lennon", "John"));
		return Response.status(200).entity(resultat).build();
	}

}
