public class hurtownicy {
    private String nazwaHurtownika;
    private double procentZniznkiHurt;

    public hurtownicy(String nazwaHurtownika, double procentZniznkiHurt){
        this.nazwaHurtownika = nazwaHurtownika;
        this.procentZniznkiHurt = procentZniznkiHurt;

    }

    public String getNazwaHurtownika(){
        return nazwaHurtownika;
    }

    public double getProcentZniznkiHurt() {
        return procentZniznkiHurt;
    }

    public void setNazwaHurtownika(String nazwaHurtownika) {
        this.nazwaHurtownika = nazwaHurtownika;
    }

    public void setProcentZniznkiHurt(double procentZniznkiHurt) {
        this.procentZniznkiHurt = procentZniznkiHurt;
    }

    @Override
    public String toString() {
        return "Nazwa: " + nazwaHurtownika + ", Procent Znizki na Hurt: " + procentZniznkiHurt;
    }

}
