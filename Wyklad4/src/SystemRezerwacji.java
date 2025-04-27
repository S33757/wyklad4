import java.util.ArrayList;

public class SystemRezerwacji {

    private ArrayList<Wydarzenie> listaRezerwacji = new ArrayList<>();
    private ArrayList<Klient> listaKlientow = new ArrayList<>();

    //

    public void dokonajRezerwacji(Klient k, Wydarzenie w) {
        this.listaRezerwacji.add(w);
        this.listaKlientow.add(k);
        w.zarezerwujMiejsce();
        k.dodajRezerwacje(w);
    }

    public void zmienCeneWydarzenia(String nazwa, double nowaCena){
        Wydarzenie w = znajdzWydarzenie(nazwa);
        if(w == null){
            throw new IllegalArgumentException("Nie znaleziono wydarzenia");
        }

        w.setCena(nowaCena);
    }

    public Wydarzenie znajdzWydarzenie(String nazwa){
        for (Wydarzenie w : listaRezerwacji){
            if (w.getNazwa().equals(nazwa)){
                return w;
            }
        }

        return null;
    }

    public Klient znajdzKlient(String imie, String nazwisko){
        for (Klient k : listaKlientow){
            if (k.getImie().equals(imie)){
                return k;
            }
        }

        return null;
    }

    public void dodajWydarzenie(Wydarzenie w) { // istniejace wydarzenie
        listaRezerwacji.add(w);
    }
    public void dodajWydarzenie(String nazwa, double cena){ // nowe wydarzenie
        Wydarzenie w = new Wydarzenie(nazwa,cena);
        listaRezerwacji.add(w);
    }

    public void dodajKlienta(Klient k) { // istniejacy klient
        listaKlientow.add(k);
    }
    public void dodajKlienta(String imie, String nazwisko){ // nowy klient
        Klient k = new Klient(imie,nazwisko);
        listaKlientow.add(k);
    }
}
