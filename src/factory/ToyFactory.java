package factory;

import toy.Toy;
import toy.enumeration.Type;

public abstract class ToyFactory {
    protected Toy toy;

    public abstract Toy buildToy(Type type);
}
