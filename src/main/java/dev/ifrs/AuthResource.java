package dev.ifrs;


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
    
    GenerateToken generate;

    @Inject
    public AuthResource(GenerateToken generate){
        this.generate = generate;
    }


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