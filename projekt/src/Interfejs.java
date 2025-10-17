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





        }


        return "";
    }

    public String zarzadzanieTowarem() {

        Scanner sc2 = new Scanner(System.in);

        System.out.println("Podaj co chcesz zrobic dalej");
        System.out.println("Dodaj Produkt [1] Usun Produkt [2] Zmien Produkt [3] Wyswietl Produkty [4] Zakoncz [5]");

        int response2 = sc2.nextInt();
        Scanner scWyborProdukty = new Scanner(System.in);

        switch (response2) {

            /*Dodaj Produkt*/

            case 1:

                System.out.println("Wybierz kategorie: agd [1] ciuchy [2] ksiazki [3] zakoncz [4]");

                switch (scWyborProdukty.nextInt()){

                    case 1:

                        System.out.println("Podaj następujące dane w tej kolejności: nazwa produktu, rodzaj (agd, rtv, ciuchy, ksiazki), cena, dostawca");

                        String nazwaProduktu = scWyborProdukty.nextLine();
                        String rodzaj = scWyborProdukty.nextLine();
                        double cena = scWyborProdukty.nextDouble();
                        String dostawcaDoWyszukania = scWyborProdukty.nextLine();
                        String dostawca = "";

                        switch (rodzaj){

                            case "agd":
                                if (!nazwaProduktu.isEmpty()){
                                    for (dostawcy d : dataManager.listaDostawcow){
                                        if (d.equals(dostawcaDoWyszukania)) {
                                            dostawca = d.getNazwaDostawcy();
                                        }

                                    }
                                    agdNaSprzedaz noweAgdNaSprzedaz = new agdNaSprzedaz(nazwaProduktu, cena, dostawca);
                                    dataManager.listaAgdNaSprzedaz.add(noweAgdNaSprzedaz);
                                }




                                break;

                            case "rtv":

                                break;

                            case "ciuchy":

                                break;

                            case "ksiazki":

                                break;

                            default:
                                System.out.println("Nieprawidlowa opcja");
                                break;




                        }




                        break;

                    case 2:

                        break;

                    case 3:

                        break;

                    case 4:

                        for (agdNaSprzedaz a : dataManager.listaAgdNaSprzedaz){

                        }



                        break;



                }

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



            case 1:
                System.out.println(historiaDzialan.historiaSprzedazy);
                break;

            /*Wyswietl historie transakcji*/


            case 2:
                System.out.println(historiaDzialan.historiaTransakcji);
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

                Scanner scHurtownicy = new Scanner(System.in);
                Scanner scHurtownicy2 = new Scanner(System.in);

                switch (wybor5) {

//                    !!!WYMAGA DODANIA NOWEGO ARRAY DO DATAMANAGER I ZMIANA PARU ZMIENNYCH W PONIŻSZYM KODZIE PO POWSTANIU KLASY HURTOWNICY!!!

                    case 1:
                        System.out.println("Podaj nazwa Hurtownika");
                        String nazwaHurtownika = scHurtownicy.nextLine();
                        System.out.println("Podaj procent znizki hurtownika na hurt (Format: 00.00)");
                        double procentZnizkiNaHurt = scHurtownicy2.nextDouble();

                        if (!nazwaHurtownika.isEmpty() && procentZnizkiNaHurt >= 0 && procentZnizkiNaHurt <= 100){
                                dataManager.listaHurtownikow.add(new hurtownicy(nazwaHurtownika, procentZnizkiNaHurt));
                        }else {
                            System.out.println("Pola nie moga byc puste");
                        }




                        break;

                    case 2:

                        System.out.println("Podaj nazwe hurtownika");
                        String nazwaHurtownikaDoUsuniecia = scHurtownicy.nextLine();


                        dataManager.listaHurtownikow.removeIf(h -> Objects.equals(h.getNazwaHurtownika(), nazwaHurtownikaDoUsuniecia));


                        break;

                    case 3:

                        System.out.println("Podaj nazwe Hurtownika");
                        String nazwaHurtownikaDoEdycji = scHurtownicy.nextLine();

                        Scanner scEdycjaHurtownika = new Scanner(System.in);

                        for (hurtownicy h : dataManager.listaHurtownikow){
                            if (Objects.equals(h.getNazwaHurtownika(), nazwaHurtownikaDoEdycji)){
                                System.out.println("Co chcesz zmienic? Nazwe [1] Procent Znizki [2]");
                                Integer wyborEdycjaHurtownika = scHurtownicy.nextInt();

                                if (wyborEdycjaHurtownika == 1){
                                    System.out.println("Podaj nowa nazwe");
                                    String nowaNazwaHurtownika = scEdycjaHurtownika.nextLine();

                                    if (!nowaNazwaHurtownika.isEmpty()){
                                        h.setNazwaHurtownika(nowaNazwaHurtownika);
                                    } else {
                                        System.out.println("Nazwa Hurtownika nie moze byc pusta");
                                    }


                                } else if (wyborEdycjaHurtownika == 2){
                                    System.out.println("Podaj nowa znizke procentowa na hurt (Format: 00:00)");
                                    double nowaZnizkaHurtownika = scEdycjaHurtownika.nextDouble();

                                    if (nowaZnizkaHurtownika >= 0 && nowaZnizkaHurtownika <= 100){
                                        h.setProcentZniznkiHurt(nowaZnizkaHurtownika);
                                    } else {
                                        System.out.println("Znizka nie moze byc pusta lub mniejsza od zera lub wieksza od 100");
                                    }



                                } else {
                                    System.out.println("nieprawidłowa opcja");
                                }

                            }
                        }


                        break;

                    case 4:

                        for (hurtownicy h : dataManager.listaHurtownikow) {
                            System.out.println(h);
                        }

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

                        if (!nazwaDostawcy.isEmpty()) {
                            if (Objects.equals(rodzajTowaru, "agd") || Objects.equals(rodzajTowaru, "rtv") || Objects.equals(rodzajTowaru, "ciuchy") || Objects.equals(rodzajTowaru, "ksiazki")) {
//                                dostawcy nowyDostawca = new dostawcy(nazwaDostawcy, rodzajTowaru);
                                dataManager.listaDostawcow.add(new dostawcy(nazwaDostawcy, rodzajTowaru));
                            } else {
                                System.out.println("Zły rodzaj towaru");
                            }
                        } else {
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

                        for (dostawcy d : dataManager.listaDostawcow) {
                            if (Objects.equals(d.getNazwaDostawcy(), nazwaDostawcyDoEdycji)) {
                                System.out.println("Co chcesz zmienic? Nazwe [1] Rodzaj Towaru [2]");
                                Integer wyborEdycjaDostawcow = scDostawcy.nextInt();

                                if (wyborEdycjaDostawcow == 1) {
                                    System.out.println("Podaj nazwe nowa");
                                    String nowaNawzaDostawcy = scEdycjaDostawcy.nextLine();

                                    if (!nowaNawzaDostawcy.isEmpty()) {
                                        d.setNazwaDostawcy(nowaNawzaDostawcy);
                                    } else {
                                        System.out.println("Nazwa nie moze byc pusta");
                                    }


                                } else if (wyborEdycjaDostawcow == 2) {
                                    System.out.println("Podaj towar nowy (agd, rtv, ciuchy, ksiazki)");
                                    String nowaTowarDostawcy = scEdycjaDostawcy.nextLine();

                                    if (Objects.equals(nowaTowarDostawcy, "agd") || Objects.equals(nowaTowarDostawcy, "rtv") || Objects.equals(nowaTowarDostawcy, "ciuchy") || Objects.equals(nowaTowarDostawcy, "ksiazki")) {
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

                Scanner scPracownicy = new Scanner(System.in);

                int wybor7 = sc7.nextInt();

                switch (wybor7) {

//                    !!!WYMAGA DODANIA NOWEGO ARRAY DO DATAMANAGER I ZMIANA PARU ZMIENNYCH W PONIŻSZYM KODZIE PO POWSTANIU KLASY HURTOWNICY!!!

                    case 1:
                        System.out.println("Podaj imie Pracownika");
                        String imiePracownika = scPracownicy.nextLine();
                        System.out.println("Podaj nazwisko Pracownika");
                        String nazwiskoPracownika = scPracownicy.nextLine();

                        if (!imiePracownika.isEmpty() && !nazwiskoPracownika.isEmpty()) {
                            dataManager.listaPracownikow.add(new pracownicy(imiePracownika, nazwiskoPracownika));
                        } else {
                            System.out.println("Imie i Nazwisko pracownika nie moze byc puste");
                        }


                        break;

                    case 2:

                        System.out.println("Podaj imie Pracownika");
                        String imiePracownikaDoUsuniecia = scPracownicy.nextLine();
                        System.out.println("Podaj nazwisko Pracownika");
                        String nazwiskoPracownikaDoUsuniecia = scPracownicy.nextLine();

                        dataManager.listaPracownikow.removeIf(d -> Objects.equals(d.getImiePracownika(), imiePracownikaDoUsuniecia) && Objects.equals(d.getNazwiskoPracownika(), nazwiskoPracownikaDoUsuniecia));


                        break;

                    case 3:

                        System.out.println("Podaj imie Pracownika ktorego chcesz edytowac");
                        String imiePracownikaDoEdycji = scPracownicy.nextLine();
                        System.out.println("Podaj nazwisko Pracownika ktorego chcesz edytowac");
                        String nazwiskoPracownikaDoEdycji = scPracownicy.nextLine();

                        Scanner scEdycjaPracownika = new Scanner(System.in);

                        for (pracownicy p : dataManager.listaPracownikow) {
                            if (Objects.equals(p.getImiePracownika(), imiePracownikaDoEdycji) && Objects.equals(p.getNazwiskoPracownika(), nazwiskoPracownikaDoEdycji)) {
                                System.out.println("Co chcesz zmienic? Imie [1] Nazwisko [2]");
                                Integer wyborEdycjaPracownikow = scPracownicy.nextInt();

                                if (wyborEdycjaPracownikow == 1) {
                                    System.out.println("Podaj nowe imie");
                                    String noweImiePracownika = scEdycjaPracownika.nextLine();

                                    if (!noweImiePracownika.isEmpty()) {
                                        p.setImiePracownika(noweImiePracownika);
                                    } else {
                                        System.out.println("Imie nie moze byc puste");
                                    }


                                } else if (wyborEdycjaPracownikow == 2) {
                                    System.out.println("Podaj nowe nazwisko");
                                    String noweNazwiskoPracownika = scEdycjaPracownika.nextLine();

                                    if (!noweNazwiskoPracownika.isEmpty()) {
                                        p.setNazwiskoPracownika(noweNazwiskoPracownika);
                                    } else {
                                        System.out.println("Nazwisko nie moze byc puste");
                                    }


                                } else {
                                    System.out.println("nieprawidłowa opcja");
                                }

                            }
                        }


                        break;

                    case 4:

                        for (pracownicy p : dataManager.listaPracownikow) {
                            System.out.println(p);
                        }

                        break;

                    case 5:

                        break;


                }
        }










        return "";
    }


    }







