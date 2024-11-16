package com.practice.parkinglot.entities;

import com.practice.parkinglot.enums.VehicleType;
import com.practice.parkinglot.model.Vehicle;

public class ParkingSpot {
    private final Integer spotNumber;
    private final VehicleType vehicleType;
    private Vehicle parkedVehicle;

    public ParkingSpot(int i, VehicleType vehicleType) {
        this.spotNumber = i;
        this.vehicleType = vehicleType;
        this.parkedVehicle = null;
    }

    public synchronized boolean isAvailable() {
        return (parkedVehicle == null);
    }

    public synchronized boolean parkVehicle(Vehicle vehicle) {
        if (vehicleType == vehicle.getType()) {
            this.parkedVehicle = vehicle;
            return true;
        }
        return false;
    }

    public void unParkVehicle(Vehicle vehicle) {
        if (vehicleType == vehicle.getType()) {
            this.parkedVehicle = null;
        }
    }

    public Integer getSpotNumber() {
        return spotNumber;
    }

    public Vehicle getParkedVehicle() {
        return parkedVehicle;
    }
}
