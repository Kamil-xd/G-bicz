import java.util.Date;

public class historiaSprzedaży {
        private Date dataSprzedazy;
        private String dostawca;
        private String produkt;
        private Integer ilosc;
        private Double koszt;
        private String klient;

    public void ciuchyNaSprzedaz(Date dataSprzedazy, String dostawca, Integer ilosc, Double koszt, String klient, String produkt){
        this.dataSprzedazy = dataSprzedazy;
        this.dostawca = dostawca;
        this.ilosc = ilosc;
        this.koszt = koszt;
        this.klient = klient;
        this.produkt = produkt;
    }

    public Date getDataSprzedazy(){
        return dataSprzedazy;
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
    public String getKlient(){
        return klient;
    }
    public String getProdukt(){
        return produkt;
    }
    public void setDataSprzedazy(Date dataSprzedazy) {
        this.dataSprzedazy = dataSprzedazy;
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
    public void setKlient(String klient) {
        this.klient = klient;
    }
    public void setProdukt(String produkt) {
        this.produkt = produkt;
    }

}


