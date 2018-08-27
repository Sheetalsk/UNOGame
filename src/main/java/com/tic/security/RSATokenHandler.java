package com.tic.security;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.exceptions.JWTCreationException;
import com.auth0.jwt.exceptions.JWTVerificationException;
import com.google.gson.Gson;
import com.tic.model.User;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.UUID;

@NoArgsConstructor
@AllArgsConstructor
public class RSATokenHandler implements TokenHandler {
    private static final String UNO = "uno";

    @AllArgsConstructor
    enum CLAIM {
        USERNAME("username");

        private String claim;
    }

    private User user;

    @Override
    public String issue() {
        Gson gson = new Gson();
        try {
            return JWT.create()
                    .withIssuer(UNO)
                    .withIssuedAt(new Date())
                    .withClaim(CLAIM.USERNAME.claim, gson.toJson(user))
                    .withJWTId(UUID.randomUUID().toString())
                    .sign(Algorithms.RSA512.getAlgorithm());
        } catch (JWTCreationException e) {
            throw new SecurityException("", e);
        }
    }

    @Override
    public void verify(String token) {
        try {
            JWTVerifier verifier = JWT.require(Algorithms.RSA512.getAlgorithm())
                    .withIssuer(UNO)
                    .build();
            verifier.verify(token);
        } catch (JWTVerificationException e) {
            throw new SecurityException("", e);
        }
    }
}
