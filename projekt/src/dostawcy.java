public class dostawcy {
    private String nazwaDostawcy;
    private String rodzajTowaru;

    public dostawcy(String nazwaDostawcy, String rodzajTowaru){
        this.nazwaDostawcy = nazwaDostawcy;
        this.rodzajTowaru = rodzajTowaru;
    }

    public String getNazwaDostawcy() {
        return nazwaDostawcy;
    }

    public String getRodzajTowaru() {
        return rodzajTowaru;
    }

    public String getDostawcaInfo(){
        return getNazwaDostawcy() + getRodzajTowaru();
    }

    public void setNazwaDostawcy(String nazwaDostawcy) {
        this.nazwaDostawcy = nazwaDostawcy;
    }

    public void setRodzajTowaru(String rodzajTowaru) {
        this.rodzajTowaru = rodzajTowaru;
    }
}
