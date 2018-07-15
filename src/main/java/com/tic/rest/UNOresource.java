package com.tic.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("uno")
public class UNOresource {
    @GET
    public String sayHello() {
        return "aloha";
    }
}
