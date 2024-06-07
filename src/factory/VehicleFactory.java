package factory;

import builder.vehicle.CarBuilder;
import builder.vehicle.ScooterBuilder;
import builder.vehicle.TruckBuilder;
import builder.vehicle.VehicleBuilder;
import toy.enumeration.Type;
import toy.vehicule.Vehicle;

public class VehicleFactory extends ToyFactory {
    private static VehicleFactory vehicleFactory;

    private VehicleFactory() {
    }

    public static VehicleFactory getInstance() {
        if (vehicleFactory == null) {
            vehicleFactory = new VehicleFactory();
        }

        return vehicleFactory;
    }

    @Override
    public Vehicle buildToy(Type type) {
        Vehicle vehicle = null;
        VehicleBuilder vehicleBuilder = null;

        switch (type) {
            case OUI_OUI_CAR, BATMAN_CAR -> vehicleBuilder = CarBuilder.getInstance();
            case SCOOTER -> vehicleBuilder = ScooterBuilder.getInstance();
            case TRUCK -> vehicleBuilder = TruckBuilder.getInstance();
        }

        if (vehicleBuilder != null) {
            vehicleBuilder.setType(type);

            vehicleBuilder.create();
            vehicleBuilder.setName();
            vehicleBuilder.buildWheels();
            vehicleBuilder.buildMotor();
            vehicleBuilder.paint();

            vehicle = vehicleBuilder.getVehicle();
        }

        return vehicle;
    }
}