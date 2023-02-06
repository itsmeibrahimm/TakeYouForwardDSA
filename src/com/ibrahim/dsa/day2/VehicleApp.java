package com.ibrahim.dsa.day2;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class VehicleApp<T,V> {

    public static void main(String[] args) {
        List<Vehicle> vehicleList = new ArrayList<>();
        vehicleList.add(new Vehicle("car", VehicleType.PRIVATE));
        vehicleList.add(new Vehicle("scooter", VehicleType.PRIVATE));
        vehicleList.add(new Vehicle("bus", VehicleType.PUBLIC));
        vehicleList.add(new Vehicle("plane", VehicleType.PUBLIC));

        //convert list to map - 
        Map<VehicleType, List<Vehicle>> vehicleMap = vehicleList.stream().
        		collect(Collectors.groupingBy( e -> e.getType()));
    }
}

class Vehicle {
    private String name;
    private VehicleType type;

    public Vehicle(String name, VehicleType type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public VehicleType getType() {
        return type;
    }

    public void setType(VehicleType type) {
        this.type = type;
    }
}

enum VehicleType{
    PRIVATE, PUBLIC
}