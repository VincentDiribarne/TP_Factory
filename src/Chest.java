import factory.PlushFactory;
import factory.VehicleFactory;
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

    private Chest() {
    }

    public static Chest getInstance() {
        if (chest == null) {
            chest = new Chest();
        }

        return chest;
    }

    public void open() {
        howManyItems();
    }


    private void howManyItems() {
        BufferedReader reader;
        String ligne;

        System.out.print("Combien d'objet voulez-vous dans le coffre ? : ");

        try {
            reader = new BufferedReader(new InputStreamReader(System.in));
            ligne = reader.readLine();

            if (ligne != null) {
                int nbItems = Integer.parseInt(ligne);

                if (nbItems < 0) {
                    generateError("Le nombre d'objet doit être positif");
                } else {
                    generate(nbItems);
                    display();
                }
            }
        } catch (Exception e) {
            generateError("Erreur lors de la saisie");
        }
    }

    private void generateError(String message) {
        System.out.println(message + "\n");
        howManyItems();
    }


    private void generate(int nbItems) {
        Random random = new Random();

        for (int i = 0; i < nbItems; i++) {
            Type type = Type.values()[random.nextInt(Type.values().length)];
            Toy toy = null;

            switch (type) {
                case OUI_OUI_CAR, BATMAN_CAR, SCOOTER, TRUCK -> {
                    toy = VehicleFactory.getInstance().buildToy(type);
                }

                case CAT_PLUSH, LION_PLUSH, OUI_OUI_PLUSH, OBELIX_PLUSH -> {
                    toy = PlushFactory.getInstance().buildToy(type);
                }
            }

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