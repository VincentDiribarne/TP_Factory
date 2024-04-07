package toy.vehicule;

import lombok.Getter;
import lombok.Setter;
import toy.Toy;
import toy.enumeration.Motor;

@Getter
@Setter
public abstract class Vehicle extends Toy {
    private Motor motor;
    private int nbWheels;

    @Override
    public String toString() {
        return getName() +
                " de couleur " + getColor().getName() + " (" + getColor().getHexCode() + "), avec " +
                getNbWheels() + " roues et un moteur " +
                getMotor().getName();
    }
}
