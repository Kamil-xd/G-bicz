public class rtvNaSprzedaz {
    private String nazwaProduktu;
    private double cenaRtv;
    private dostawcy dostawca;


    public rtvNaSprzedaz(String nazwaProduktu, double cenaRtv, dostawcy dostawca) {
        this.nazwaProduktu = nazwaProduktu;
        this.cenaRtv = cenaRtv;
        this.dostawca = dostawca;


    }

    public double getCenaRtv() {
        return cenaRtv;
    }

    public dostawcy getDostawca() {
        return dostawca;
    }

    public String getNazwaProduktu() {
        return nazwaProduktu;
    }

    public void setCenaRtv(double cenaRtv) {
        this.cenaRtv = cenaRtv;
    }

    public void setDostawca(dostawcy dostawca) {
        this.dostawca = dostawca;
    }

    public void setNazwaProduktu(String nazwaProduktu) {
        this.nazwaProduktu = nazwaProduktu;
    }

    @Override
    public String toString() {
        return "Nazwa: " + nazwaProduktu + ", Cena " + cenaRtv + ", Dostawca " + dostawca;
    }



}



