import java.util.Date;

public class historiaTransakcji {

    private Date dataTransakcji;
    private String dostawca;
    private String produkt;
    private Integer ilosc;
    private Double koszt;

    public void ciuchyNaSprzedaz(Date dataSprzedazy, String dostawca, Integer ilosc, Double koszt, String produkt){
        this.dataTransakcji = dataSprzedazy;
        this.dostawca = dostawca;
        this.ilosc = ilosc;
        this.koszt = koszt;
        this.produkt = produkt;
    }


    public Date getDataSprzedazy(){
        return dataTransakcji;
    }
    public String getDostawca(){
        return dostawca;
    }
    public Integer getIlosc(){
        return ilosc;
    }
    public Double getKoszt(){
        return koszt;
    }
    public String getProdukt(){
        return produkt;
    }
    public void setDataSprzedazy(Date dataSprzedazy) {
        this.dataTransakcji = dataSprzedazy;
    }
    public void setDostawca(String dostawca) {
        this.dostawca = dostawca;
    }
    public void setIlosc(Integer ilosc) {
        this.ilosc = ilosc;
    }
    public void setKoszt(Double koszt) {
        this.koszt = koszt;
    }
    public void setProdukt(String produkt) {
        this.produkt = produkt;
    }

}
