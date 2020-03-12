package com.teedjay;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

@Path("/path")
@RegisterRestClient(baseUri = "http://localhost:8080/")
public interface PathResourceRestClient {

    @GET
    String whatIsMyQueryParam(@QueryParam("name") String name);

}
