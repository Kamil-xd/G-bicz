public class rtvNaSprzedaz {
    private String nazwaProduktu;
    private double cenaRtv;
    private String dostawca;


    public rtvNaSprzedaz(String nazwaProduktu, double cenaRtv, String dostawca) {
        this.nazwaProduktu = nazwaProduktu;
        this.cenaRtv = cenaRtv;
        this.dostawca = dostawca;


    }

    public double getCenaRtv() {
        return cenaRtv;
    }

    public String getDostawca() {
        return dostawca;
    }

    public String getNazwaProduktu() {
        return nazwaProduktu;
    }

    public void setCenaRtv(double cenaRtv) {
        this.cenaRtv = cenaRtv;
    }

    public void setDostawca(String dostawca) {
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



