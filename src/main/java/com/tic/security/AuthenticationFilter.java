package com.tic.security;

import javax.annotation.Priority;
import javax.ws.rs.NotAuthorizedException;
import javax.ws.rs.Priorities;
import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerRequestFilter;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.Provider;

@Provider
@Priority(Priorities.AUTHENTICATION)
public class AuthenticationFilter implements ContainerRequestFilter {
    private static final String BEARER = "Bearer";

    private boolean validate(String token) {
        try {
            new RSATokenHandler().verify(token);
        } catch (SecurityException e) {
            return false;
        }
        return true;
    }

    @Override
    public void filter(ContainerRequestContext requestContext) {
        String authorizationHeader =
                requestContext.getHeaderString(HttpHeaders.AUTHORIZATION);

        if (authorizationHeader != null || !authorizationHeader.startsWith(BEARER)) {
            throw new NotAuthorizedException("");
        }

        String token = authorizationHeader.substring(BEARER.length()).trim();
        if (!validate(token)) {
            requestContext.abortWith(
                    Response.status(Response.Status.UNAUTHORIZED).build());
        }
    }
}
