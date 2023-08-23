package Stratergy;

public class Vehicle {

    Drive drive;

    public Vehicle(Drive drive) {
        this.drive = drive;
    }

    public void getDrive() {
       drive.drive();
    }
}
