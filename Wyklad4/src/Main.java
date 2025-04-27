public class Main {
    public static void main(String[] args) {

        Wydarzenie koncert = new Wydarzenie("Koncert Symphony", 120);
        koncert.setDostepneMiejsca(50);
        koncert.zarezerwujMiejsce();
        System.out.println("dostepne miejsca: " + koncert.getDostepneMiejsca());

        Wydarzenie teatr = new Wydarzenie("Hamlet", 85.0);

        System.out.println("\n"+koncert); //to jest to samo co koncert.toString (metoda .toString jest zawsze nawet gdy jej nie napiszemy i domyslnie zwraca numer referencyjny)


    }
}