import java.util.Objects;
import java.util.Scanner;

public class Interfejs {

    public Interfejs() {

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
        System.out.println("Działaj na Hurtownikach [1] Działaj na Dostawcach [2] Działaj na Pracownikach [3] Zakończ [4]");

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

                Scanner scDostawcy = new Scanner(System.in);

                switch (wybor6) {



                    case 1:
                        System.out.println("Podaj nazwe dostawcy");
                        String nazwaDostawcy = scDostawcy.nextLine();
                        System.out.println("Podaj rodzaj towaru (agd, rtv, ciuchy, ksiazki)");
                        String rodzajTowaru = scDostawcy.nextLine();

                        if (!nazwaDostawcy.isEmpty()){
                            if (Objects.equals(rodzajTowaru, "agd") || Objects.equals(rodzajTowaru, "rtv") || Objects.equals(rodzajTowaru, "ciuchy") || Objects.equals(rodzajTowaru, "ksiazki")){
//                                dostawcy nowyDostawca = new dostawcy(nazwaDostawcy, rodzajTowaru);
                                dataManager.listaDostawcow.add(new dostawcy(nazwaDostawcy, rodzajTowaru));
                            }else {
                                System.out.println("Zły rodzaj towaru");
                            }
                        }else {
                            System.out.println("Nazwa towaru nie moze byc pusta");
                        }




                        break;

                    case 2:

                        System.out.println("Podaj nazwe dostawcy");
                        String nazwaDostawcyDoUsuniecia = scDostawcy.nextLine();

                        dataManager.listaDostawcow.removeIf(d -> Objects.equals(d.getNazwaDostawcy(), nazwaDostawcyDoUsuniecia));


                        break;

                    case 3:

                        System.out.println("Podaj nazwe dostawcy ktorego chcesz edytowac");
                        String nazwaDostawcyDoEdycji = scDostawcy.nextLine();

                        Scanner scEdycjaDostawcy = new Scanner(System.in);

                        for (dostawcy d : dataManager.listaDostawcow){
                            if (Objects.equals(d.getNazwaDostawcy(), nazwaDostawcyDoEdycji)){
                                System.out.println("Co chcesz zmienic? Nazwe [1] Rodzaj Towaru [2]");
                                Integer wyborEdycjaDostawcow = scDostawcy.nextInt();

                                if (wyborEdycjaDostawcow == 1){
                                    System.out.println("Podaj nazwe nowa");
                                    String nowaNawzaDostawcy = scEdycjaDostawcy.nextLine();

                                    if (!nowaNawzaDostawcy.isEmpty()){
                                        d.setNazwaDostawcy(nowaNawzaDostawcy);
                                    } else {
                                        System.out.println("Nazwa nie moze byc pusta");
                                    }


                                } else if (wyborEdycjaDostawcow == 2) {
                                    System.out.println("Podaj towar nowy (agd, rtv, ciuchy, ksiazki)");
                                    String nowaTowarDostawcy = scEdycjaDostawcy.nextLine();

                                    if (Objects.equals(nowaTowarDostawcy, "agd") || Objects.equals(nowaTowarDostawcy, "rtv") || Objects.equals(nowaTowarDostawcy, "ciuchy") || Objects.equals(nowaTowarDostawcy, "ksiazki")){
                                        d.setRodzajTowaru(nowaTowarDostawcy);
                                    } else {
                                        System.out.println("nieprawidłowa nazwa towaru");
                                    }



                                } else {
                                    System.out.println("nieprawidłowa opcja");
                                }

                            }
                        }


                        break;

                    case 4:

                        for (dostawcy d : dataManager.listaDostawcow) {
                            System.out.println(d);
                        }

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






