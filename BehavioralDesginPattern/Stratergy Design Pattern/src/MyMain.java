import Stratergy.NormalDrive;
import Stratergy.Vehicle;

public class MyMain {
    public static void main(String[] args) {
        //Vehicle vehicle = new CityRoadVehicle();
        Vehicle vehicle = new OffRoadVehicle();
        vehicle.getDrive();
    }
}
