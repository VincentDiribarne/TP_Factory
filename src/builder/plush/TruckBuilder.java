package builder.plush;

import toy.vehicule.Motor;

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
    public void buildWheels() {
        vehicle.setNbWheels(8);
    }

    @Override
    public void buildMotor() {
        vehicle.setMotor(Motor.GASOLINE);
    }
}
