package org.example;


import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        Vehicle vehicle1 = new Vehicle();
        // no name yet
        System.out.println(vehicle1.getName());
        // give name
        vehicle1.setName("Poppy car");
        System.out.println(vehicle1.getName());
        // basically an id for each vehicle
        System.out.println(vehicle1.count);



        Vehicle vehicle2 = new Vehicle("My Dream Car", "Red", "2024", "BMW", "800");
        System.out.println(vehicle2.getColor());
        // changes color
        vehicle2.setColor("purple");
        System.out.println(vehicle2.getColor());
        // checks what was entered for engine and prints out speed according to getSpeed function
        System.out.println(vehicle2.getSpeed());
        System.out.println(vehicle2.count);

        System.out.println(Vehicle.getVehicle());

        Car car1 = new Car("Poppy Car", "Red", "2024", "BMW", "800", true, false);
        System.out.println(car1.getLedScreen());
        // still fetches variables from parent class because Car extends Vehicle
        System.out.println(car1.getName());

    }


}