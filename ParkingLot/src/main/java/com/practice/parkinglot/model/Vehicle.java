package com.practice.parkinglot.model;

import com.practice.parkinglot.enums.VehicleType;

import java.util.Objects;

public abstract class Vehicle {
    protected String licensePlate;
    protected VehicleType type;

    public Vehicle(String licensePlate, VehicleType type) {
        this.licensePlate = licensePlate;
        this.type = type;
    }

    public VehicleType getType() {
        return type;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Vehicle vehicle = (Vehicle) o;
        return Objects.equals(licensePlate, vehicle.licensePlate) && type == vehicle.type;
    }

    @Override
    public int hashCode() {
        return Objects.hash(licensePlate, type);
    }
}
