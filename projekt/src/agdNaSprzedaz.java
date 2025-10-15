public class agdNaSprzedaz {
    private String nazwaProduktu;
    private String rodzajAgd ;
    private Integer cenaAgd;
    private dostawcy dostawca;


    public agdNaSprzedaz(String nazwaProduktu, String rodzajAgd, Integer cenaAgd, dostawcy dostawca){
        this.nazwaProduktu = nazwaProduktu;
        this.rodzajAgd = rodzajAgd;
        this.cenaAgd = cenaAgd;
        this.dostawca = dostawca;


    }

    public dostawcy getDostawca() {
        return dostawca;
    }

    public Integer getCenaAgd() {
        return cenaAgd;
    }

    public String getNazwaProduktu() {
        return nazwaProduktu;
    }

    public String getRodzajAgd() {
        return rodzajAgd;
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

    public void setRodzajAgd(String rodzajAgd) {
        this.rodzajAgd = rodzajAgd;
    }


}
