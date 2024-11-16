package com.practice.parkinglot.model;

import com.practice.parkinglot.enums.VehicleType;

public class TruckVehicle extends Vehicle {
    public TruckVehicle(String licensePlate) {
        super(licensePlate, VehicleType.TRUCK);
    }
}
