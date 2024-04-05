package factory;

import builder.CarBuilder;
import builder.ScooterBuilder;
import builder.TruckBuilder;
import builder.VehicleBuilder;
import toy.Type;
import toy.vehicule.Vehicle;

public class VehicleFactory {
    private static VehicleFactory vehicleFactory;

    private VehicleFactory() {
    }

    public static VehicleFactory getInstance() {
        if (vehicleFactory == null) {
            vehicleFactory = new VehicleFactory();
        }

        return vehicleFactory;
    }

    public Vehicle createVehicle(Type toyType) {
        Vehicle vehicle = null;
        VehicleBuilder vehicleBuilder = null;

        switch (toyType) {
            case OUI_OUI_CAR -> {
                vehicleBuilder = CarBuilder.getInstance();
                CarBuilder.getInstance().setCarType(Type.OUI_OUI_CAR);
            }

            case BATMAN_CAR -> {
                vehicleBuilder = CarBuilder.getInstance();
                CarBuilder.getInstance().setCarType(Type.BATMAN_CAR);
            }

            case SCOOTER -> vehicleBuilder = ScooterBuilder.getInstance();
            case TRUCK -> vehicleBuilder = TruckBuilder.getInstance();
        }


        if (vehicleBuilder != null) {
            vehicleBuilder.buildWheels();
            vehicleBuilder.buildMotor();

            vehicle = vehicleBuilder.getVehicle();
        }

        return vehicle;
    }
}