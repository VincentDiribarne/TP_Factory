package factory;

import builder.plush.AnimalPlushBuilder;
import builder.plush.PersonPlushBuilder;
import builder.plush.PlushBuilder;
import toy.enumeration.Type;
import toy.plush.Plush;

public class PlushFactory extends ToyFactory {
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
        PlushBuilder plushBuilder = null;

        switch (type) {
            case CAT_PLUSH, LION_PLUSH -> {
                plushBuilder = AnimalPlushBuilder.getInstance();
                AnimalPlushBuilder.getInstance().setPlushType(type);
            }

            case OUI_OUI_PLUSH, OBELIX_PLUSH -> {
                plushBuilder = PersonPlushBuilder.getInstance();
                PersonPlushBuilder.getInstance().setPlushType(type);
            }
        }

        if (plushBuilder != null) {
            plushBuilder.create();
            plushBuilder.paint();
            plushBuilder.setHeight();
            plushBuilder.fill();

            plush = plushBuilder.getPlush();
            plush.setName(type.getName());
        }

        return plush;
    }
}
