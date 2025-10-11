public class ksiazkiNaSprzedaz {
    private String rodzajKsiazki ;
    private Integer cenaKsiazki;
    private Integer isbnKsiazki;
    private String autorKsiazki;


    public ksiazkiNaSprzedaz(String rodzajKsiazki, Integer cenaKsiazki, Integer isbnKsiazki, String autorKsiazki){
        this.cenaKsiazki = cenaKsiazki;
        this.rodzajKsiazki = rodzajKsiazki;
        this.isbnKsiazki = isbnKsiazki;
        this.autorKsiazki = autorKsiazki;
    }
    //rodzaj
    public String getRodzajKsiazki(){
        return rodzajKsiazki;
    }

    public void setRodzajKsiazki(String rodzajKsiazki) {
        this.rodzajKsiazki = rodzajKsiazki;
    }

    //cena
    public Integer getCenaKsiazki(){
        return cenaKsiazki;
    }

    public void setCenaKsiazki(Integer cenaKsiazki) {
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
}
