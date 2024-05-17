package builder.vehicle;

import toy.enumeration.Color;
import toy.enumeration.Motor;
import toy.vehicule.Truck;

public class TruckBuilder extends VehicleBuilder {
    private static TruckBuilder instance;

    private TruckBuilder() {
    }

    public static TruckBuilder getInstance() {
        if (instance == null) {
            instance = new TruckBuilder();
        }

        return instance;
    }

    @Override
    public void create() {
        vehicle = new Truck();
    }

    @Override
    public void buildMotor() {
        vehicle.setMotor(Motor.GASOLINE);
    }

    @Override
    public void buildWheels() {
        vehicle.setNbWheels(8);
    }

    @Override
    public void paint() {
        vehicle.setColor(Color.YELLOW);
    }
}
