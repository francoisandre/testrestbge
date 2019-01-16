package fr.bge.rest;

import java.net.URI;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;

import org.glassfish.grizzly.http.server.HttpServer;
import org.glassfish.jersey.grizzly2.httpserver.GrizzlyHttpServerFactory;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestCalculatriceGrizzly {

	private HttpServer serveur;

	@Before
	public void demarrageServeur() {

		URI chemin = UriBuilder.fromUri("http://localhost/").port(9998).path("testrest/rest/").build();
		serveur = GrizzlyHttpServerFactory.createHttpServer(chemin, new GrizzlyConfig());
	}

	@After
	public void arreteServeur() {
		if (serveur != null) {
			serveur.shutdownNow();
		}
	}

	@Test
	public void testAddition() {
		Client client = ClientBuilder.newClient();
		WebTarget webTarget = client.target("http://localhost:9998/testrest/rest/calculatrice/addition/2/4");
		Response response = webTarget.request().get();

		String contenu = response.readEntity(String.class);
		Assert.assertTrue(contenu.contains("6"));
		Assert.assertEquals(200, response.getStatus());
	}

}
