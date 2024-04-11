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
            vehicleBuilder.create();
            vehicleBuilder.buildWheels();
            vehicleBuilder.buildMotor();
            vehicleBuilder.paint();

            vehicle = vehicleBuilder.getVehicle();
            vehicle.setName(type.getName());
        }

        return vehicle;
    }
}