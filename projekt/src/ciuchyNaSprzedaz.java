public class ciuchyNaSprzedaz {
    private String nazwaProduktu;
    private double cenaCiuchu;
    private dostawcy dostawca;



    public ciuchyNaSprzedaz(String nazwaProduktu, Double cenaCiuchu, dostawcy dostawca ) {
        this.nazwaProduktu = nazwaProduktu;
        this.cenaCiuchu = cenaCiuchu;
        this.dostawca = dostawca;
    }
//rodzaj


    public dostawcy getDostawca() {
        return dostawca;
    }

    public String getNazwaProduktu() {
        return nazwaProduktu;
    }

    public double getCenaCiuchu() {
        return cenaCiuchu;
    }

    public void setNazwaProduktu(String nazwaProduktu) {
        this.nazwaProduktu = nazwaProduktu;
    }

    public void setDostawca(dostawcy dostawca) {
        this.dostawca = dostawca;
    }

    public void setCenaCiuchu(double cenaCiuchu) {
        this.cenaCiuchu = cenaCiuchu;
    }

    @Override
    public String toString() {
        return "Nazwa: " + nazwaProduktu + ", Cena " + cenaCiuchu + ", dostawca " + dostawca ;
    }
}


