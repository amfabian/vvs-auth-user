package dev.ifrs;

import java.util.Arrays;
import java.util.HashSet;

import javax.annotation.security.PermitAll;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.eclipse.microprofile.jwt.Claims;

import io.smallrye.jwt.build.Jwt;

@Path("/auth")
public class AuthResource {
    
    GenerateToken generate;

    @Inject
    public AuthResource(GenerateToken generate){
        this.generate = generate;
    }

    private String teste;

    @Path("/getjwt")
    @POST
    @PermitAll
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    @Produces(MediaType.TEXT_PLAIN)
    public String getJWT(@FormParam("name") String name, @FormParam("email") String email){
        System.out.println("get JWT methodo");
        return generate.getToken("ale", "ale@mail.com");
    }
    // post para token com grupo admin
    @Path("/getadmin")
    @POST
    @PermitAll
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    @Produces(MediaType.TEXT_PLAIN)
    public String getADMIN(@FormParam("name") String name, @FormParam("email") String email){
        System.out.println("get JWT with ADMIN methodo");

        return generate.getTokenAdmin("ale", "ale@mail.com");
    }


}