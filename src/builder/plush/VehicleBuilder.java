package builder.plush;

import lombok.Getter;
import lombok.Setter;
import toy.Type;
import toy.vehicule.Vehicle;

@Setter
@Getter
public abstract class VehicleBuilder {
    protected Vehicle vehicle;

    public void setName(Type type) {
        vehicle.setName(type.getName());
    }

    public abstract void buildWheels();

    public abstract void buildMotor();
}