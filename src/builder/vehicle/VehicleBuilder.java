package builder.vehicle;

import lombok.Getter;
import toy.vehicule.Vehicle;

@Getter
public abstract class VehicleBuilder {
    protected Vehicle vehicle;

    public abstract void create();

    public abstract void paint();

    public abstract void buildWheels();

    public abstract void buildMotor();
}