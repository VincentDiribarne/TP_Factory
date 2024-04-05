package factory.plush;

import factory.ToyFactory;
import toy.Type;
import toy.plush.Plush;

public class PlushFactory extends ToyFactory<Plush> {
    private static PlushFactory plushFactory;

    private PlushFactory() {
    }

    public static PlushFactory getInstance() {
        if (plushFactory == null) {
            plushFactory = new PlushFactory();
        }

        return plushFactory;
    }


    @Override
    public Plush buildToy(Type type) {
        Plush plush = null;



        return plush;
    }
}
