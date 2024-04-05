package toy.vehicule;

import lombok.Getter;
import lombok.Setter;
import toy.Toy;

@Getter
@Setter
public abstract class Vehicle extends Toy {
    private Motor motor;
    private int nbWheels;
}
