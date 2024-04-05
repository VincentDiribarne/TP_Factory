package builder;

import lombok.Getter;
import lombok.Setter;
import toy.vehicule.Vehicle;

@Setter
@Getter
public abstract class VehicleBuilder {
    protected Vehicle vehicle;

    public abstract void buildWheels();

    public abstract void buildMotor();
}