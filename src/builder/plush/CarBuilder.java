package builder.plush;

import lombok.Setter;
import toy.Type;
import toy.vehicule.Motor;


@Setter
public class CarBuilder extends VehicleBuilder {
    private Type carType;
    private static CarBuilder instance;

    private CarBuilder() {
    }

    public static CarBuilder getInstance() {
        if (instance == null) {
            instance = new CarBuilder();
        }

        return instance;
    }

    @Override
    public void buildWheels() {
        vehicle.setNbWheels(4);
    }

    @Override
    public void buildMotor() {
        switch (carType) {
            case OUI_OUI_CAR -> vehicle.setMotor(Motor.ELECTRIC);
            case BATMAN_CAR -> vehicle.setMotor(Motor.GASOLINE);
        }
    }
}