import java.util.Scanner;

public class Interfejs {

    public Interfejs(){

    }

    public String response1(int response){

        switch (response){
            case 1:
                zarzadzanieTowarem();
                break;

            case 2:
                archiwum();
                break;

            case 3:
                hurtownicyDostawcyPracownicy();
                break;

            case 4:
                zarzadzanieZamowieniamiSprzedaza();
                break;



        }


        return "";
    }

    public String zarzadzanieTowarem() {

        Scanner sc2 = new Scanner(System.in);

        System.out.println("Podaj co chcesz zrobic dalej");
        System.out.println("Dodaj Produkt [1] Usun Produkt [2] Zmien Produkt [3] Wyswietl Produkty [4] Zakoncz [5]");

        int response2 = sc2.nextInt();

        switch (response2) {

            /*Dodaj Produkt*/

            case 1:

                break;

            /*Usun Produkt*/


            case 2:

                break;

            /*Zmien Produkt*/

            case 3:

                break;

            /*Wyswietl Produkty*/

            case 4:

                break;

            /*Zakoncz*/

            case 5:

                break;

        }
        return "";
    }

    public String archiwum() {

        Scanner sc3 = new Scanner(System.in);

        System.out.println("Podaj co chcesz zrobic dalej");
        System.out.println("Wyświetl historie Sprzedazy [1] Wyswietl historie Transakcji [2] Zakoncz [3]");

        int response3 = sc3.nextInt();

        switch (response3) {

            /*Wyswietl historie sprzedazy*/

            case 1:

                break;

            /*Wyswietl historie transakcji*/


            case 2:

                break;

            /*Zakoncz*/

            case 3:

                break;
        }
        return "";
    }

    public String hurtownicyDostawcyPracownicy(){

        Scanner sc4 = new Scanner(System.in);

        System.out.println("Podaj co chcesz zrobic dalej");
        System.out.println("Wyświetl historie Sprzedazy [1] Wyswietl historie Transakcji [2] Zakoncz [3]");

        int response4 = sc4.nextInt();

        switch (response4) {

            /*Działania na Hurtownikach*/

            case 1:







                break;

            /*Działania na Dostawcach*/


            case 2:







                break;

            /*Działania na Prawcownikach*/

            case 3:








                break;
        }










        return "";
    }
//
//    public String zarzadzanieZamowieniamiSprzedaza(){
//
//
//        return "";
//    }



    }



}



