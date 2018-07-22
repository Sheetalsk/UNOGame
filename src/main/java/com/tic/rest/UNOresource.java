package com.tic.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("uno")
public class UNOresource {


    @GET
    @Produces(MediaType.APPLICATION_JSON)


    public Response sayHello() {
        Card card = new Card();
        card.setColor("purple");

        MyMessage mm = new MyMessage();
        mm.title = "halo";
        mm.status = "status";

        return Response.ok().entity(mm).build();

   }

}
