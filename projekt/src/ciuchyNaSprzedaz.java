public class ciuchyNaSprzedaz {
    private String nazwaProduktu;
    private double cenaCiuchu;
    private String dostawca;



    public ciuchyNaSprzedaz(String nazwaProduktu, Double cenaCiuchu, String dostawca ) {
        this.nazwaProduktu = nazwaProduktu;
        this.cenaCiuchu = cenaCiuchu;
        this.dostawca = dostawca;
    }
//rodzaj


    public String getDostawca() {
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

    public void setDostawca(String dostawca) {
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


