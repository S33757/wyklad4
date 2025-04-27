public class Wydarzenie {

    private String nazwa;
    private String data;
    private String miejsce;
    private int maxLiczbaMiejsc=100;
    private int dostepneMiejsca=0;
    private double cena;

    public Wydarzenie(String nazwa, double cena) {
        this.nazwa = nazwa;
        this.cena = cena;
    }
    public Wydarzenie(String nazwa, double cena, String data) {
        this.nazwa = nazwa;
        this.cena = cena;
        this.data = data;
    }
    public Wydarzenie(String nazwa, double cena, String data, String miejsce){
        this.nazwa = nazwa;
        this.cena = cena;
        this.data = data;
        this.miejsce = miejsce;
    }


}
