package factory;

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
}
