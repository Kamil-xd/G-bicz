public class ksiazkiNaSprzedaz {
    private String nazwaProduktu;
    private double cenaKsiazki;
    private dostawcy dostawca;




    public ksiazkiNaSprzedaz(String nazwaProduktu, double cenaKsiazki, dostawcy dostawca) {

    }
    //rodzaj

    public dostawcy getDostawca() {
        return dostawca;
    }

    public String getNazwaProduktu() {
        return nazwaProduktu;
    }

    //cena

    public Double getCenaKsiazki(){
        return cenaKsiazki;
    }

    public void setCenaKsiazki(Double cenaKsiazki) {
        this.cenaKsiazki = cenaKsiazki;
    }

    //autor



    //isbn


    //nazwa


    public void setDostawca(dostawcy dostawca) {
        this.dostawca = dostawca;
    }

    public void setNazwaProduktu(String nazwaProduktu) {
        this.nazwaProduktu = nazwaProduktu;
    }

    public void setCenaKsiazki(double cenaKsiazki) {
        this.cenaKsiazki = cenaKsiazki;
    }

    @Override
    public String toString() {
        return ", nazwa" + nazwaProduktu + ", cenaKsiazki" + cenaKsiazki + ", dostawca" + dostawca;
    }
}
