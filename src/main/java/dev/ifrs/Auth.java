package dev.ifrs;

import java.util.Arrays;
import java.util.HashSet;

import javax.annotation.security.PermitAll;
import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.eclipse.microprofile.jwt.Claims;

import io.smallrye.jwt.build.Jwt;

@Path("/auth")
public class Auth {
    
    private String teste;

    @Path("/getjwt")
    @POST
    @PermitAll
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    @Produces(MediaType.TEXT_PLAIN)
    public String getJWT(@FormParam("name") String name, @FormParam("email") String email){
        System.out.println("get JWT methodo");

        return Jwt.issuer("http://localhost:8084")
            .upn(email)
            .groups(new HashSet<>(Arrays.asList("User")))
            .expiresAt(System.currentTimeMillis() + 360000)
            .claim(Claims.full_name, name)
            .claim(Claims.email, email)
            .sign();
    }

    @Path("/getadmin")
    @POST
    @PermitAll
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    @Produces(MediaType.TEXT_PLAIN)
    public String getADMIN(@FormParam("name") String name, @FormParam("email") String email){
        System.out.println("get JWT with ADMIN methodo");

        return Jwt.issuer("http://localhost:8084")
            .upn(email)
            .groups(new HashSet<>(Arrays.asList("Admin")))
            .expiresAt(System.currentTimeMillis() + 360000)
            .claim(Claims.full_name, name)
            .claim(Claims.email, email)
            .sign();
    }
}