public class agdNaSprzedaz {
    private String nazwaProduktu;
    private double cenaAgd;
    private String dostawca;


    public agdNaSprzedaz(String nazwaProduktu, double cenaAgd, String dostawca) {
        this.nazwaProduktu = nazwaProduktu;
        this.cenaAgd = cenaAgd;
        this.dostawca = dostawca;


    }

    public String getDostawca() {
        return dostawca;
    }

    public double getCenaAgd() {
        return cenaAgd;
    }

    public String getNazwaProduktu() {
        return nazwaProduktu;
    }


    public void setCenaAgd(Integer cenaAgd) {
        this.cenaAgd = cenaAgd;
    }

    public void setDostawca(String dostawca) {
        this.dostawca = dostawca;
    }

    public void setNazwaProduktu(String nazwaProduktu) {
        this.nazwaProduktu = nazwaProduktu;
    }

    @Override
    public String toString() {
        return "Nazwa: " + nazwaProduktu + ", Cena " + cenaAgd + ", Dostawca " + dostawca;
    }



}



