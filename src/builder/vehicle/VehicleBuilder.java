package builder.vehicle;

import builder.GlobalBuilder;
import lombok.Getter;
import toy.vehicule.Vehicle;

@Getter
public abstract class VehicleBuilder extends GlobalBuilder {
    protected Vehicle vehicle;

    public abstract void buildMotor();

    public abstract void buildWheels();

    public void setName() {
        vehicle.setName(getType().getName());
    }
}