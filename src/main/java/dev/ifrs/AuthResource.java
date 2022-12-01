package dev.ifrs;


import java.util.logging.Logger;

import javax.annotation.security.PermitAll;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;



@Path("/auth")
public class AuthResource {
    
    private static final Logger LOGGER = Logger.getLogger(AuthResource.class.getName()); 

    AuthService service;

    @Inject
    public AuthResource(AuthService service){
        this.service = service;
    }


    @Path("/getjwt")
    @POST
    @PermitAll
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    @Produces(MediaType.TEXT_PLAIN)
    public String getJWT(@FormParam("name") String name, @FormParam("email") String email){
        LOGGER.info("get JWT methodo");
        return service.getToken(name, email);
    }
    // post para token com grupo admin
    @Path("/getadmin")
    @POST
    @PermitAll
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    @Produces(MediaType.TEXT_PLAIN)
    public String getADMIN(@FormParam("name") String name, @FormParam("email") String email){
        LOGGER.info("get JWT with ADMIN methodo");

        return service.getTokenAdmin(name, email);
    }


}