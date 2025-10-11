public class ciuchyNaSprzedaz {
    private String rodzajUbran ;
    private Integer cenaUbran;
    private String rozmiarUbran;
    private String kolorUbran;


    public ciuchyNaSprzedaz(String rodzajUbran, Integer cenaUbran, String rozmiarUbran, String kolorUbran){
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
    public Integer getCenaUbran(){
        return cenaUbran;
    }

    public void setCenaUbran(Integer cenaUbran) {
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

