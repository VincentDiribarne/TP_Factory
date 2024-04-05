package builder.plush;

import toy.vehicule.Motor;

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
    public void buildWheels() {
        vehicle.setNbWheels(2);
    }

    @Override
    public void buildMotor() {
        vehicle.setMotor(Motor.DIESEL);
    }
}
