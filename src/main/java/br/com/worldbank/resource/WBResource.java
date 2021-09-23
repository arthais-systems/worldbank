package br.com.worldbank.resource;

import java.io.IOException;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import br.com.worldbank.service.interfaces.ImplWBService;

@Path("/worldbank")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class WBResource {

    @Inject
    ImplWBService service;

    @GET
    @Path("{codCountry}")
    public Response hello(@PathParam("codCountry") String codCountry) throws IOException {
        try {
            return Response.ok(service.getIndicatorsByCodCountry(codCountry)).build();
        } catch (Exception e) {
            return Response.status(500, e.toString()).build();
        }
    }
}