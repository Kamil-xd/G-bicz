public class agdNaSprzedaz {
    private String nazwaProduktu;
    private double cenaAgd;
    private dostawcy dostawca;


    public agdNaSprzedaz(String nazwaProduktu, double cenaAgd, dostawcy dostawca) {
        this.nazwaProduktu = nazwaProduktu;
        this.cenaAgd = cenaAgd;
        this.dostawca = dostawca;


    }

    public dostawcy getDostawca() {
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

    public void setDostawca(dostawcy dostawca) {
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



