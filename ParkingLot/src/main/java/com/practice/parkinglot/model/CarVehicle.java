package com.practice.parkinglot.model;

import com.practice.parkinglot.enums.VehicleType;

public class CarVehicle extends Vehicle{
    public CarVehicle(String licensePlate) {
        super(licensePlate, VehicleType.CAR);
    }
}
