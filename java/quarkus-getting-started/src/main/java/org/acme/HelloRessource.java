package org.acme;

import org.eclipse.microprofile.config.inject.ConfigProperty;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/hello")
public class HelloRessource {

    @ConfigProperty(name = "greeting")
    String greeting;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return greeting + " Quarkus";
    }

    @GET
    @Path("/fr")
    @Produces(MediaType.TEXT_PLAIN)
    public String bonjour(){
        return "Salut Raoul, tu es trop fort, keep on going bro !";
    }

}
