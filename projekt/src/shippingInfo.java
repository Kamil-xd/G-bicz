import java.util.Date;

public class shippingInfo {
    private Date dataDostarczenia;
    private Date dataWysyłki;
    private String adresat;
    private String dostawca;
    private String hurtownik;

    public shippingInfo(Date dataDostarczenia, Date dataWysyłki, String adresat, String dostawca, String hurtownik){
        this.dataDostarczenia = dataDostarczenia;
        this.dataWysyłki = dataWysyłki;
        this.adresat = adresat;
        this.dostawca = dostawca;
        this.hurtownik = hurtownik;

    }
    public Date getDataDostarczenia(){
        return dataDostarczenia;
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

    public void setDataDostarczenia(Date dataDostarczenia) {
        this.dataDostarczenia = dataDostarczenia;
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
        return "dataDostarczenia: " + dataDostarczenia + ", dataWysyłki: " + dataWysyłki + ", adresat: " + adresat + ", dostawca:"+dostawca + ", hurtownik: " + hurtownik;
    }

}
