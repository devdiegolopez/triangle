package org.acme.controller;

import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import org.acme.domain.data.dto.request.RequestDto;

import java.util.logging.Logger;

@Path("/hello")
public class GreetingResource {

    private static final Logger LOG = Logger.getLogger(String.valueOf(GreetingResource.class));
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "Hello from Quarkus REST";
    }
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public Response triangle(RequestDto requestDto) {
            LOG.info("Received request: " + requestDto);
        return null;
    }

}
