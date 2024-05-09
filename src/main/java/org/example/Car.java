package org.example;

public class Car extends Vehicle{
    private boolean powerSteering = false;
    private boolean ledScreen = true;


    //constructor with all variables from parent class plus all variables in current class
    public Car(String name, String color, String model, String company, String engine, boolean powerSteering, boolean ledScreen) {
        super(name, color, model, company, engine);
        this.powerSteering = powerSteering;
        this.ledScreen = ledScreen;
    }

    // overrides vehicle getName method
    public String getName() {
        return "The name of your car is " + super.getName();
    }

    public boolean getLedScreen() {
        return ledScreen;
    }

    public void setLedScreen(boolean ledScreen) {
        this.ledScreen = ledScreen;
    }

    public boolean getPowerSteering() {
        return powerSteering;
    }

    public void setPowerSteering(boolean powerSteering) {
        this.powerSteering = powerSteering;
    }
}
