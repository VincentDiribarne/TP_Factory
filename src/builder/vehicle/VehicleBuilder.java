package builder.vehicle;

import builder.Constructable;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import toy.enumeration.Type;
import toy.vehicule.Vehicle;

@Getter
@Setter
public abstract class VehicleBuilder implements Constructable {
    private Type carType;

    @Setter(AccessLevel.NONE)
    protected Vehicle vehicle;

    public abstract void buildWheels();

    public abstract void buildMotor();

    public void setName() {
        vehicle.setName(carType.getName());
    }
}