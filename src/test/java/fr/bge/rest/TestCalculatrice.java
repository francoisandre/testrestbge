package fr.bge.rest;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;

import org.junit.Assert;
import org.junit.Test;

public class TestCalculatrice {

	@Test
	public void testAddition() {
		Client client = ClientBuilder.newClient();
		WebTarget webTarget = client.target("http://localhost:8080/testrest/rest/calculatrice/addition/2/4");
		Response response = webTarget.request().get();

		String contenu = response.readEntity(String.class);
		Assert.assertTrue(contenu.contains("6"));
		Assert.assertEquals(200, response.getStatus());
	}

}
