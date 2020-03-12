package com.teedjay;

import org.eclipse.microprofile.rest.client.inject.RestClient;

import javax.enterprise.context.RequestScoped;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

@Path("path")
@RequestScoped
public class PathResource {

    @RestClient
    PathResourceRestClient client;

    @GET
    public String whatIsMyQueryParam(@QueryParam("name") String name) {
        return String.format("My mame is '%s'%n", name);
    }

    @GET
    @Path("test")
    public String callMyselfUsingRestClient() {
        return client.whatIsMyQueryParam("Åse Østerås Ærvik ");
    }

}
