package com.smartcampus.store;

import com.smartcampus.model.Room;
import com.smartcampus.model.Sensor;
import com.smartcampus.model.SensorReading;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class DataStore {
    private static final DataStore INSTANCE = new DataStore();

    private final Map<String, Room> rooms = Collections.synchronizedMap(new LinkedHashMap<>());
    private final Map<String, Sensor> sensors = Collections.synchronizedMap(new LinkedHashMap<>());
    private final Map<String, List<SensorReading>> readings = Collections.synchronizedMap(new LinkedHashMap<>());

    private DataStore() {
        // singleton
    }

    public static DataStore getInstance() {
        return INSTANCE;
    }

    public Map<String, Room> getRooms() {
        return rooms;
    }

    public Map<String, Sensor> getSensors() {
        return sensors;
    }

    public Map<String, List<SensorReading>> getReadings() {
        return readings;
    }
}
