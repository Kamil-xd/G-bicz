public class rtvNaSprzedaz {
    private String rodzajRTV ;
    private Double cenaRTV;
    private String markaRTV;



    public rtvNaSprzedaz(String markaRTV, Double cenaRTV, String rodzajRTV){
        this.cenaRTV = cenaRTV;
        this.rodzajRTV = rodzajRTV;
        this.markaRTV= markaRTV;
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

}
