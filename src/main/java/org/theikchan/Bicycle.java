package org.theikchan;

// https://dev.java/learn/classes-objects/creating-classes/ 
public class Bicycle {
    private int cadence;
    private int gear;
    private int speed;

    static final double PI = 3.14159;
    private static int numberOfBicycles = 0; // Bicycle.numberOfBicycles

    // static initialization block
    static {

    }

    // initializing instance member
    {

    }

    public Bicycle() {
        cadence = 10;
        speed = 0;
        gear = 1;
    }

    public Bicycle(int startCadence, int startSpeed, int startGear) {
        gear = startGear;
        cadence = startCadence;
        speed = startSpeed;
    }

    // can't override in subclass
    protected final void getType(){ }

    public void setCadence(int newValue) {
        cadence = newValue;
    }

    public void setGear(int newValue) {

    }

    public void applyBrake(int decrement) {
        speed -= decrement;
    }

    public void speedUp(int increment) {
        speed += increment;
    }

    public int getCadence() {
        return cadence;
    }

    public int getGear() {
        return gear;
    }

    public int getSpeed() {
        return speed;
    }
}
