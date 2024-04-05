package factory.vehicle;

import builder.plush.CarBuilder;
import builder.plush.ScooterBuilder;
import builder.plush.TruckBuilder;
import builder.plush.VehicleBuilder;
import factory.ToyFactory;
import toy.Type;
import toy.vehicule.Vehicle;

public class VehicleFactory extends ToyFactory<Vehicle> {
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
    public Vehicle buildToy(Type toyType) {
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
            vehicleBuilder.setName(toyType);
            vehicleBuilder.buildWheels();
            vehicleBuilder.buildMotor();

            vehicle = vehicleBuilder.getVehicle();
        }

        return vehicle;
    }
}