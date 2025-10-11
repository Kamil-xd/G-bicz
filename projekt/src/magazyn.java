public class magazyn {
    private String nazwaMagazyn;
    private Double cenaMagazyn;
    private Integer iloscMagazyn;


    public magazyn(String nazwaMagazyn, Double cenaMagazyn, Integer iloscMagazyn) {
        this.nazwaMagazyn = nazwaMagazyn;
        this.cenaMagazyn = cenaMagazyn;
        this.iloscMagazyn = iloscMagazyn;
    }

    //nazwy
    public String getNazwaMagazyn() {
        return nazwaMagazyn;
    }

    public void setNazwaMagazyn(String nazwaMagazyn) {
        this.nazwaMagazyn = nazwaMagazyn;
    }

    //ceny
    public Double getCenaMagazyn() {
        return cenaMagazyn;
    }

    public void setCenaMagazyn(Double cenaMagazyn) {
        this.cenaMagazyn = cenaMagazyn;
    }

    //ilości
    public Integer getIloscMagazyn() {
        return iloscMagazyn;
    }

    public void setIloscMagazyn(Integer iloscMagazyn) {
        this.iloscMagazyn = iloscMagazyn;
    }
}
