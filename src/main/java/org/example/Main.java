package org.example;


public class Main {
    public static void main(String[] args) {

        Vehicle vehicle1 = new Vehicle();
        // no name yet
        System.out.println(vehicle1.getName());
        // give name
        vehicle1.setName("Poppy car");
        System.out.println(vehicle1.getName());

        Vehicle vehicle2 = new Vehicle("My Dream Car", "Red", "2024", "BMW");
        System.out.println(vehicle2.getColor());
        // changes color
        vehicle2.setColor("purple");
        System.out.println(vehicle2.getColor());


    }
}