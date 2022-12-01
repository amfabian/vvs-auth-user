package dev.ifrs;

import java.util.Arrays;
import java.util.HashSet;
import java.util.logging.Logger;

import javax.enterprise.context.RequestScoped;

import org.eclipse.microprofile.jwt.Claims;

import io.smallrye.jwt.build.Jwt;

@RequestScoped
public class AuthService {
    private static final Logger LOGGER = Logger.getLogger(AuthService.class.getName()); 


    public String getToken(String name, String email){

        String token;
        token = Jwt.issuer("https://quarkus.io/")
                    .upn(email)
                    .groups(new HashSet<>(Arrays.asList("User")))
                    .expiresAt(System.currentTimeMillis() + 360000)
                    .claim(Claims.full_name, name)
                    .claim(Claims.email, email)
                    .sign();
                    LOGGER.info("getToken metodo");

        return token;
    }

    public String getTokenAdmin(String name, String email){

        String token;
        token = Jwt.issuer("https://quarkus.io/")
                    .upn(email)
                    .groups(new HashSet<>(Arrays.asList("Admin")))
                    .expiresAt(System.currentTimeMillis() + 360000)
                    .claim(Claims.full_name, name)
                    .claim(Claims.email, email)
                    .sign();
                    LOGGER.info("getTokenAdmin metodo");

        return token;
    }

    
}
