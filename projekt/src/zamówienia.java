import java.util.Date;

public class zamówienia {
    private String produkt;
    private Double cena;
    private Date dataWysyłki;
    private String adresat;
    private String dostawca;
    private String hurtownik;

    public zamówienia(String produkt, Double cena, Date dataWysyłki, String adresat, String dostawca, String hurtownik){
        this.produkt = produkt;
        this.cena = cena;
        this.dataWysyłki = dataWysyłki;
        this.adresat = adresat;
        this.dostawca = dostawca;
        this.hurtownik = hurtownik;

    }
    public String getProdukt(){
        return produkt;
    }
    public Double getCena(){
        return cena;
    }
    public Date getDataWysyłki(){
        return dataWysyłki;
    }
    public String getAdresat(){
        return adresat;
    }
    public String getDostawca(){
        return dostawca;
    }
    public String getHurtownik(){
        return hurtownik;
    }

    public void setProdukt(String produkt) {
        this.produkt = produkt;
    }
    public void setCena(Double cena) {
        this.cena = cena;
    }
    public void setDataWysyłki(Date dataWysyłki) {
        this.dataWysyłki = dataWysyłki;
    }
    public void setAdresat(String adresat) {
        this.adresat = adresat;
    }
    public void setDostawca(String dostawca) {
        this.dostawca = dostawca;
    }
    public void setHurtownik(String hurtownik) {
        this.hurtownik = hurtownik;
    }

    @Override
    public String toString() {
        return "produkt: " + produkt +"cena: "+cena+ ", dataWysyłki: " + dataWysyłki + ", adresat: " + adresat + ", dostawca:"+dostawca + ", hurtownik: " + hurtownik;
    }

}
