package builder.vehicle;

import toy.enumeration.Color;
import toy.enumeration.Motor;
import toy.vehicule.Scooter;

public class ScooterBuilder extends VehicleBuilder {
    private static ScooterBuilder instance;

    private ScooterBuilder() {
    }

    public static ScooterBuilder getInstance() {
        if (instance == null) {
            instance = new ScooterBuilder();
        }

        return instance;
    }

    @Override
    public void create() {
        vehicle = new Scooter();
    }

    @Override
    public void buildMotor() {
        vehicle.setMotor(Motor.DIESEL);
    }

    @Override
    public void buildWheels() {
        vehicle.setNbWheels(2);
    }

    @Override
    public void paint() {
        vehicle.setColor(Color.BLUE);
    }
}
