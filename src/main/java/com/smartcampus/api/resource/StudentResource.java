package com.smartcampus.api.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/students")
public class StudentResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String getStudents() {
        return "[{\"id\":1,\"name\":\"John\"}]";
    }
}