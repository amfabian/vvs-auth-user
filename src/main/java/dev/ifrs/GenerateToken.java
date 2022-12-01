package dev.ifrs;

import java.util.Arrays;
import java.util.HashSet;

import javax.enterprise.context.RequestScoped;

import org.eclipse.microprofile.jwt.Claims;

import io.smallrye.jwt.build.Jwt;

@RequestScoped
public class GenerateToken {

    public String getToken(String name, String email){

        String token;
        token = Jwt.issuer("https://quarkus.io/")
                    .upn(email)
                    .groups(new HashSet<>(Arrays.asList("User")))
                    .expiresAt(System.currentTimeMillis() + 360000)
                    .claim(Claims.full_name, name)
                    .claim(Claims.email, email)
                    .sign();
            System.out.println("getToken Class");
            System.out.println(token);

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
            System.out.println("getToken Class");
            System.out.println(token);

        return token;
    }

    
}
