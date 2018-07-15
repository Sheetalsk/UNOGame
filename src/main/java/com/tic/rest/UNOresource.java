package com.tic.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("uno")
public class UNOresource {
    @GET
    public String sayHello() {
        Card card = new Card();
        card.setColor("purple");

        return card.getId() + card.getColor();

   }

}
