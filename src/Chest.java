public class Chest {
    private static Chest chest = null;

    private Chest() {
    }

    public static Chest getInstance() {
        if (chest == null) {
            chest = new Chest();
        }

        return chest;
    }

    public void open() {
        System.out.println("Chest opened");
    }
}