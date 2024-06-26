package org.example.vehicle;

public class Vehicle {

    private String name = "";
    private String color = "";
    private String model = "";
    private String company = "";
    private String engine = "800";
    public static int count = 0;


    // no arg constructor
    public Vehicle() {
        count++;
    }

    public Vehicle(String name, String color, String model, String company, String engine) {
        this.name = name;
        this.color = color;
        this.model = model;
        this.company = company;
        this.engine = engine;
        count++;
    }



    // setters
    public void setName(String name) {
        this.name = name;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public void setCompany(String company) {
        this.company = company;
    }
    public void setEngine(String engine) {this.engine = engine; }


    // getters
    public String getName() {
        return this.name;
    }
    public String getColor() {
       return this.color;
    }
    public String getModel() {
      return this.model ;
    }
    public String getCompany() {
      return this.company;
    }
    private String getEngine() {
        return this.engine;
    }
    public static String getVehicle() { return "Name and color set."; }

//    uses engine to check speed
    public int getSpeed() {
        String a = getEngine();
        if (a == "800") {
            return 90;
        } else {
            return 120;
        }
    }

    public String getInfo() {
        return "this is a vehicle";
    }
}
