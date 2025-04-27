public class Wydarzenie {

    private String nazwa;
    private String data;
    private String miejsce;
    private int maxLiczbaMiejsc=100;
    private int dostepneMiejsca=0;
    private double cena;

    public Wydarzenie(String nazwa, double cena) {
        this.nazwa = nazwa;
        this.setCena(cena);
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

    public boolean zarezerwujMiejsce(){
        if(dostepneMiejsca<=0){
            System.out.println("Brak wolnych miejsc");
            return false;
        }
        this.dostepneMiejsca--;
        System.out.println("Zarezerwacja sie powiodla");
        return true;
    }

    public String toString(){
        return this.nazwa;
    }

    public double getCena() {
        return cena;
    }
    public void setCena(double cena) {
        if(cena < 0){
            throw new IllegalArgumentException("Cena nie moze byc mniejsza od 0");
        }
        this.cena = cena;
    }

    public int getDostepneMiejsca() {
        if(dostepneMiejsca > maxLiczbaMiejsc){
            throw new IllegalArgumentException("Nie moze byc wiecej dostepnych miejsc od maksymalnej liczby miejsc");
        }
        return dostepneMiejsca;
    }
    public void setDostepneMiejsca(int dostepneMiejsca) {
        this.dostepneMiejsca = dostepneMiejsca;
    }

    public int getMaxLiczbaMiejsc() {
        return maxLiczbaMiejsc;
    }
    public void setMaxLiczbaMiejsc(int maxLiczbaMiejsc) {
        this.maxLiczbaMiejsc = maxLiczbaMiejsc;
    }

    public String getMiejsce() {
        return miejsce;
    }
    public void setMiejsce(String miejsce) {
        this.miejsce = miejsce;
    }

    public String getData() {
        return data;
    }
    public void setData(String data) {
        this.data = data;
    }

    public String getNazwa() {
        return nazwa;
    }
    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }
}
