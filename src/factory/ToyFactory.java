package factory;

import toy.Type;

public abstract class ToyFactory<T> {
    public abstract T buildToy(Type type);
}
