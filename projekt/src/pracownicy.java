public class pracownicy {
    private String imiePracownika ;
    private String nazwiskoPracownika;



    public pracownicy(String imiePracownika, String nazwiskoPracownika){
        this.imiePracownika = imiePracownika;
        this.nazwiskoPracownika = nazwiskoPracownika;

    }
    //imie
    public String getImiePracownika(){
        return imiePracownika;
    }

    public void setImiePracownika(String imiePracownika) {
        this.imiePracownika = imiePracownika;
    }

    //nazwisko
    public String getNazwiskoPracownika(){
        return nazwiskoPracownika;
    }

    public void setNazwiskoPracownika(String nazwiskoPracownika) {
        this.nazwiskoPracownika = nazwiskoPracownika;
    }


}
