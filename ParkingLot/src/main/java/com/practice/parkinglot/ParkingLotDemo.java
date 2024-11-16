package com.practice.parkinglot;

import com.practice.parkinglot.entities.Level;
import com.practice.parkinglot.entities.ParkingLot;
import com.practice.parkinglot.model.BikeVehicle;
import com.practice.parkinglot.model.CarVehicle;
import com.practice.parkinglot.model.TruckVehicle;
import com.practice.parkinglot.model.Vehicle;

public class ParkingLotDemo {
    public static void main(String[] args) {

        System.out.println("Hello, World!");
        ParkingLot parkingLot = ParkingLot.getInstance();
        parkingLot.addLevels(new Level(10));
        parkingLot.addLevels(new Level(10));

        Vehicle car1 = new CarVehicle("123");
        Vehicle car2 = new CarVehicle("345");

        Vehicle bike1 = new BikeVehicle("321");
        Vehicle bike2 = new BikeVehicle("543");

        Vehicle truck1 = new TruckVehicle("987");
        Vehicle truck2 = new TruckVehicle("789");

        parkingLot.printOccupancy();

        parkingLot.parkVehicle(car1);
        parkingLot.parkVehicle(car2);
        parkingLot.parkVehicle(bike1);
        parkingLot.parkVehicle(bike2);
        parkingLot.parkVehicle(truck1);
        parkingLot.parkVehicle(truck2);

        parkingLot.printOccupancy();
    }
}