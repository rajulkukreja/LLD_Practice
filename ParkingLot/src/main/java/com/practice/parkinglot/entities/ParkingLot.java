package com.practice.parkinglot.entities;

import com.practice.parkinglot.model.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class ParkingLot {
    private List<Level> levels;
    private static ParkingLot instance;

    private ParkingLot() {
        this.levels = new ArrayList<>();
    }

    public static synchronized ParkingLot getInstance() {
        if(instance == null) {
            instance = new ParkingLot();
        }
        return instance;
    }

    public synchronized void addLevels(Level level) {
        this.levels.add(level);
    }

    public Boolean parkVehicle(Vehicle vehicle) {
        for(Level level : levels) {
            if(level.parkVehicle(vehicle)) {
                System.out.println("Vehicle Parked Successfully");
                return true;
            }
        }
        System.out.println("No place available to park vehicle");
        return false;
    }

    public Boolean unParkVehicle(Vehicle vehicle) {
        for(Level level: levels) {
            if(level.unParkVehicle(vehicle)) {
                System.out.println("Vehicle UnParked Successfully");
                return true;
            }
        }
        System.out.println("No Vehicle available in Parking");
        return false;
    }

    public void printOccupancy() {
        for(Level level : levels) {
            level.printOccupancy();
        }
    }
}
