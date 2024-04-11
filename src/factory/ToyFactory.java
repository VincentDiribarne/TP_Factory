package factory;

import toy.Toy;
import toy.enumeration.Type;

public abstract class ToyFactory {
    protected Toy toy;

    public abstract Toy buildToy(Type type);

    public static ToyFactory getFactory(Type type) {
        ToyFactory factory = null;
        switch (type) {
            case OUI_OUI_CAR, BATMAN_CAR, SCOOTER, TRUCK -> factory = VehicleFactory.getInstance();

            case CAT_PLUSH, LION_PLUSH, OUI_OUI_PLUSH, OBELIX_PLUSH -> factory = PlushFactory.getInstance();
        }

        return factory;
    }
}
