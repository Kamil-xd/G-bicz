public class ksiazkiNaSprzedaz {
    private String rodzajKsiazki ;
    private Double cenaKsiazki;
    private Integer isbnKsiazki;
    private String autorKsiazki;
    private  String nazwaKsiazki;


    public ksiazkiNaSprzedaz(String rodzajKsiazki, Double cenaKsiazki, Integer isbnKsiazki, String autorKsiazki,  String nazwaKsiazki) {
        this.cenaKsiazki = cenaKsiazki;
        this.rodzajKsiazki = rodzajKsiazki;
        this.isbnKsiazki = isbnKsiazki;
        this.autorKsiazki = autorKsiazki;
        this.nazwaKsiazki = nazwaKsiazki;
    }
    //rodzaj

    public String getRodzajKsiazki(){
        return rodzajKsiazki;
    }

    public void setRodzajKsiazki(String rodzajKsiazki) {
        this.rodzajKsiazki = rodzajKsiazki;
    }

    //cena

    public Double getCenaKsiazki(){
        return cenaKsiazki;
    }

    public void setCenaKsiazki(Double cenaKsiazki) {
        this.cenaKsiazki = cenaKsiazki;
    }

    //autor

    public String getAutorKsiazki(){
        return autorKsiazki;
    }

    public void setAutorKsiazki(String autorKsiazki) {
        this.autorKsiazki = autorKsiazki;
    }

    //isbn

    public Integer getIsbnKsiazki(){
        return isbnKsiazki;
    }

    public void setIsbnKsiazki(Integer isbnKsiazki) {
        this.isbnKsiazki = isbnKsiazki;
    }

    //nazwa

    public String getNazwaKsiazki(){return nazwaKsiazki;}

    public void setNazwaKsiazki(String nazwaKsiazki) {this.nazwaKsiazki = nazwaKsiazki;}
}
