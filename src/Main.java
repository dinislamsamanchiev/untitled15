public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        Printable[] printable = {createObject("Berserk"), createObject("Saitama"), createObject("Thore")};
        for (Printable print : printable) {
            print.toString();
        }
    }

    public static Anime createObject(String className) {
        switch (className) {
            case "Berserk" -> {
                Berserk berserk = new Berserk(56, "Dinislam", "Black Mechnik");
                berserk.printable();
                return berserk;
            }
            case "Saitama" -> {
                Saitama saitama = new Saitama(39, "Jack Vorobey", "Pirate");
                saitama.printable();
                return saitama;
            }
            case "Thore" -> {
                Thore thore = new Thore(88, "Aleksey", "God of storm");
                thore.printable();
                return thore;
            }
        }
        return null;
    }
}
