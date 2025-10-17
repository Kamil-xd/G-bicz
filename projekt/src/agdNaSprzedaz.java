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


        private String rodzajAGD ;
        private Double cenaAGD;
        private String markaAGD;
        private String nazwaAGD;




        public agdNaSprzedaz(String markaAGD, Double cenaAGD, String rodzajAGD, String nazwaAGD) {
            this.cenaAGD = cenaAGD;
            this.rodzajAGD = rodzajAGD;
            this.markaAGD = markaAGD;
            this.nazwaAGD = nazwaAGD;
        }
        //rodzaj

        public String getRodzajAGD(){
            return rodzajAGD;
        }

        public void setRodzajAGD(String rodzajAGD) {
            this.rodzajAGD = rodzajAGD;
        }

        //cena

        public Double getCenaAGD(){
            return cenaAGD;
        }

        public void setCenaAGD(Double cenaAGD) {
            this.cenaAGD = cenaAGD;
        }

        //marka

        public String getMarkaAGD(){
            return markaAGD;
        }

        public void setMarkaAGD(String markaAGD) {
            this.markaAGD = markaAGD;
        }

    //nazwa

    public String getNazwaAGD(){
        return nazwaAGD;
    }

    public void setNazwaAGD(String nazwaAGD) {
        this.nazwaAGD = nazwaAGD;
    }


}
