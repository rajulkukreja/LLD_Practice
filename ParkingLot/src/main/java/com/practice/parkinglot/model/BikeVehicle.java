package com.practice.parkinglot.model;

import com.practice.parkinglot.enums.VehicleType;

public class BikeVehicle extends Vehicle{
    public BikeVehicle(String licensePlate) {
        super(licensePlate, VehicleType.BIKE);
    }
}
