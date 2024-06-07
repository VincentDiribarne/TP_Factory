import factory.ToyFactory;
import toy.Toy;
import toy.enumeration.Type;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Chest {
    private static Chest chest = null;
    private final List<Toy> toys = new ArrayList<>();
    private boolean limit = false;

    private Chest() {
    }

    public static Chest getInstance() {
        if (chest == null) {
            chest = new Chest();
        }

        return chest;
    }

    public void open() {
        limitItems();
        howManyItems();
    }

    private void limitItems() {
        System.out.print("Voulez vous limiter à 10 items maximum ? (y/n) : ");
        String confirmLimit = keyBoardLine();

        if (confirmLimit != null && (confirmLimit.equals("y") || confirmLimit.equals("n"))) {
            if (confirmLimit.equals("y")) {
                limit = true;
            }
        } else {
            System.out.println("Erreur lors de la saisie");
            limitItems();
        }
    }


    private void howManyItems() {
        System.out.printf("\nCombien d'objet voulez-vous dans le coffre ? %s : ", (limit ? "(max 10)" : ""));
        String howManyItems = keyBoardLine();

        if (howManyItems != null) {
            int nbItems = Integer.parseInt(howManyItems);

            if (nbItems < 0) {
                howManyItemsError("Le nombre d'objet doit être positif");
            } else if (limit && nbItems > 10) {
                howManyItemsError("Le nombre doit être inférieur à 10, vous avez activez la limite");
            } else {
                generate(nbItems);
                display();
            }
        } else {
            howManyItemsError("Erreur lors de la saisie");
        }

    }

    private void howManyItemsError(String message) {
        System.out.println(message);
        howManyItems();
    }

    private String keyBoardLine() {
        String line = null;

        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            line = reader.readLine();
        } catch (Exception e) {
            System.out.println("Erreur lors de la saisie");
        }

        return line;
    }

    private void generate(int nbItems) {
        Random random = new Random();

        for (int i = 0; i < nbItems; i++) {
            Type type = Type.values()[random.nextInt(Type.values().length)];
            Toy toy = ToyFactory.getFactory(type).buildToy(type);

            if (toy != null) {
                toys.add(toy);
            }
        }
    }

    private void display() {
        System.out.println("\nVotre coffre contient : ");
        toys.forEach(toy -> System.out.println("\r - " + toy));
    }
}