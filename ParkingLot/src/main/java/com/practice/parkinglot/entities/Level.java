package com.practice.parkinglot.entities;

import com.practice.parkinglot.enums.VehicleType;
import com.practice.parkinglot.model.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class Level {
    private List<ParkingSpot> parkingSpotList;

    public Level(int spots) {
        // Divide spots into 50:40:10 ratio to bikes, cars and truck
        parkingSpotList = new ArrayList<>(spots);
        int bikeSpots = spots/2;
        int carSpots =  (int) (spots * 0.4);

        System.out.println(bikeSpots + " spots " + carSpots);

        int i =0;
        for(; i< bikeSpots; i++) {
            parkingSpotList.add(new ParkingSpot(i, VehicleType.BIKE));
        }

        for(; i< (bikeSpots+carSpots); i++) {
            parkingSpotList.add(new ParkingSpot(i, VehicleType.CAR));
        }

        for(; i< spots; i++) {
            parkingSpotList.add(new ParkingSpot(i, VehicleType.TRUCK));
        }
    }

    public synchronized boolean parkVehicle(Vehicle vehicle) {
        for(ParkingSpot spot : parkingSpotList) {
            if(spot.isAvailable() && spot.parkVehicle(vehicle)) {
                System.out.println("Successfully parked at spot" + spot.getSpotNumber());
                return true;
            }
        }
        return false;
    }

    public boolean unParkVehicle(Vehicle vehicle) {
        for(ParkingSpot spot : parkingSpotList) {
            if(!spot.isAvailable() && spot.getParkedVehicle().equals(vehicle)) {
                spot.unParkVehicle(vehicle);
                System.out.println("Successfully upParked at spot" + spot.getSpotNumber());
                return true;
            }
        }
        return false;
    }

    public void printOccupancy() {
        int availableCount = 0;
        for(ParkingSpot spot : parkingSpotList) {
            if(spot.isAvailable()) {
                availableCount++;
            }
        }
        System.out.println("Available spot count at level is " + availableCount);
    }
}
