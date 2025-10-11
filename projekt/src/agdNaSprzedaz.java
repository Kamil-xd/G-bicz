public class agdNaSprzedaz {

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
