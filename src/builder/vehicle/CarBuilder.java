package builder.vehicle;

import lombok.Getter;
import lombok.Setter;
import toy.enumeration.Color;
import toy.enumeration.Motor;
import toy.vehicule.Car;


@Getter
@Setter
public class CarBuilder extends VehicleBuilder {
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
    public void create() {
        vehicle = new Car();
    }

    @Override
    public void buildMotor() {
        switch (getType()) {
            case OUI_OUI_CAR -> vehicle.setMotor(Motor.ELECTRIC);
            case BATMAN_CAR -> vehicle.setMotor(Motor.GASOLINE);
        }
    }

    @Override
    public void buildWheels() {
        vehicle.setNbWheels(4);
    }

    @Override
    public void paint() {
        switch (getType()) {
            case OUI_OUI_CAR -> vehicle.setColor(Color.RED);
            case BATMAN_CAR -> vehicle.setColor(Color.BLACK);
        }
    }
}