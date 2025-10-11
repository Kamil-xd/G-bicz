public class ciuchyNaSprzedaz {
    private String rodzajUbran ;
    private Double cenaUbran;
    private String rozmiarUbran;
    private String kolorUbran;


    public ciuchyNaSprzedaz(String rodzajUbran, Double cenaUbran, String rozmiarUbran, String kolorUbran){
        this.cenaUbran = cenaUbran;
        this.rozmiarUbran = rozmiarUbran;
        this.rodzajUbran = rodzajUbran;
        this.kolorUbran = kolorUbran;
    }
//rodzaj

    public String getRodzajUbran(){
        return rodzajUbran;
    }

    public void setRodzajUbran(String rodzajUbran) {
        this.rodzajUbran = rodzajUbran;
    }

    //cena

    public Double getCenaUbran(){
        return cenaUbran;
    }

    public void setCenaUbran(Double cenaUbran) {
        this.cenaUbran = cenaUbran;
    }

    //kolor

    public String getKolorUbran(){
        return kolorUbran;
    }

    public void setKolorUbran(String kolorUbran) {
        this.kolorUbran = kolorUbran;
    }

    //rozmiar

    public String getRozmiarUbran(){
        return rozmiarUbran;
    }

    public void setRozmiarUbran(String rozmiarUbran) {
        this.rozmiarUbran = rozmiarUbran;
    }
}

