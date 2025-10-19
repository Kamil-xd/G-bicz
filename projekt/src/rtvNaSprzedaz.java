public class rtvNaSprzedaz {
    private String rodzajRTV ;
    private Double cenaRTV;
    private String markaRTV;
    private String nazwaRTV;




    public rtvNaSprzedaz(String markaRTV, Double cenaRTV, String rodzajRTV,  String nazwaRTV) {
        this.cenaRTV = cenaRTV;
        this.rodzajRTV = rodzajRTV;
        this.markaRTV= markaRTV;
        this.nazwaRTV = nazwaRTV;
    }
    //rodzaj

    public String getRodzajRTV(){
        return rodzajRTV;
    }

    public void setRodzajRTV(String rodzajRTV) {
        this.rodzajRTV = rodzajRTV;
    }

    //cena

    public Double getCenaRTV(){
        return cenaRTV;
    }

    public void setCenaRTV(Double cenaRTV) {
        this.cenaRTV = cenaRTV;
    }

    //marka

    public String getMarkaRTV(){
        return markaRTV;
    }

    public void setMarkaRTV(String markaRTV) {
        this.markaRTV = markaRTV;
    }

    //nazwa

    public String getNazwaRTV(){return nazwaRTV;}

    public void setNazwaRTV(String nazwaRTV) {this.nazwaRTV = nazwaRTV;}




    @Override
    public String toString() {
        return "Nazwa: " + nazwaRTV + ", marka: " + markaRTV + ", rodzaj: " + rodzajRTV + ", cena: " + cenaRTV;
    }
}
