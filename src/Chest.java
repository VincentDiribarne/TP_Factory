import toy.Toy;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Chest {
    private static Chest chest = null;
    private final List<Toy> toys = new ArrayList<>();

    private Chest() {
    }

    public static Chest getInstance() {
        if (chest == null) {
            chest = new Chest();
        }

        return chest;
    }

    public void open() {
        generate();
        display();
    }

    private void generate() {
        Random random = new Random();

        for (int i = 0; i < 10; i++) {


            //toys.add()
        }
    }

    private void display() {

    }
}