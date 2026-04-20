package com.smartcampus.resource;

import com.smartcampus.model.Room;
import com.smartcampus.store.DataStore;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.List;

@Path("/rooms")
public class RoomResource {

    private final DataStore dataStore = DataStore.getInstance();

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getAllRooms() {
        List<Room> rooms = new ArrayList<>(dataStore.getRooms().values());
        return Response.ok(rooms).build();
    }
}
