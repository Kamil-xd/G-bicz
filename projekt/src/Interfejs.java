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
                Scanner sc5 = new Scanner(System.in);
                System.out.println("Dodaj Hurtownika [1] Usun Hurtownika [2] Zmien Hurtownika [3] Wyswietl Hurtownikow [4] Zakoncz [5]");

                int wybor5 = sc5.nextInt();

                switch (wybor5) {

                    case 1:

                        break;

                    case 2:

                        break;

                    case 3:

                        break;

                    case 4:

                        break;

                    case 5:

                        break;



                }







                break;

            /*Działania na Dostawcach*/


            case 2:

                Scanner sc6 = new Scanner(System.in);
                System.out.println("Dodaj Dostawce [1] Usun Dostawce [2] Zmien Dostawce [3] Wyswietl Dostawców [4] Zakoncz [5]");

                int wybor6 = sc6.nextInt();

                switch (wybor6) {

                    case 1:

                        break;

                    case 2:

                        break;

                    case 3:

                        break;

                    case 4:

                        break;

                    case 5:

                        break;



                }







                break;

            /*Działania na Prawcownikach*/

            case 3:


                Scanner sc7 = new Scanner(System.in);
                System.out.println("Dodaj Pracownika [1] Usun Pracownika [2] Zmien Pracownika [3] Wyswietl Pracownikow [4] Zakoncz [5]");

                int wybor7 = sc7.nextInt();

                switch (wybor7) {

                    case 1:

                        break;

                    case 2:

                        break;

                    case 3:

                        break;

                    case 4:

                        break;

                    case 5:

                        break;



                }








                break;
        }










        return "";
    }

    public String zarzadzanieZamowieniamiSprzedaza(){
        Scanner sc8 = new Scanner(System.in);

        System.out.println("Podaj co chcesz zrobic dalej");
        System.out.println("Kody Znizkowe [1] Koszyk [2] Shipping Info [3] Zamowienia [4] Zwroty [5] Zakoncz [6]");

        int response8 = sc8.nextInt();

        switch (response8) {

            /*Kody Znizkowe*/

            case 1:

                break;

            /*Koszyk*/


            case 2:

                break;

            /*Shipping Info*/

            case 3:

                break;

            /*Zamowienia*/

            case 4:

                break;

            /*Zwroty*/

            case 5:

                break;

            /*Zakonczy*/

            case 6:

                break;
        }



        return "";
    }



    }



}



