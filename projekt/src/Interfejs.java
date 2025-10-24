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
            case 5:
               dataManager.petla = false;
               System.out.println("Zakończono Program");
            break;



        }


        return "";
    }

    public String zarzadzanieTowarem() {

        Scanner sc2 = new Scanner(System.in);

        System.out.println("Podaj co chcesz zrobic dalej");
        System.out.println("Dodaj Produkt [1] Usun Produkt [2] Zmien Produkt [3] Wyswietl Produkty [4] powrót [5]");

        int response2 = sc2.nextInt();
        Scanner scWyborProdukty = new Scanner(System.in);


        switch (response2) {

            /*Dodaj Produkt*/

            case 1:


                System.out.println("Wybierz kategorie: agd [1] rtv [2] ciuchy [3] ksiazki [4] powrót [4]");

                int wybor = scWyborProdukty.nextInt();
                String rodzaj = "";

                switch (wybor) {
                    case 1:
                        rodzaj = "agd";
                        break;
                    case 2:
                        rodzaj = "rtv";
                        break;
                    case 3:
                        rodzaj = "ciuchy";
                        break;
                    case 4:
                        rodzaj = "ksiazki";
                        break;
                    default:
                        System.out.println("Nieprawidlowa opcja");
                        break;


                }


                System.out.println("Podaj następujące dane w tej kolejności: nazwa produktu, cena, dostawca");

                String nazwaProduktu = scWyborProdukty.nextLine();
                Scanner scWyborProduktyDouble = new Scanner(System.in);
                double cenaProduktu = scWyborProduktyDouble.nextDouble();
                String dostawcaDoWyszukania = scWyborProdukty.nextLine();
                dostawcy dostawca = null;

                for (dostawcy d : dataManager.listaDostawcow){
                    if (dostawcaDoWyszukania.equals(d.getNazwaDostawcy())){
                        dostawca = d;

                    }
                }



                if (rodzaj.equals("agd")){
                    dataManager.listaAgdNaSprzedaz.add(new agdNaSprzedaz(nazwaProduktu, cenaProduktu, dostawca));
                }else if (rodzaj.equals("rtv")){
                    dataManager.listaRtvNaSprzedaz.add(new rtvNaSprzedaz(nazwaProduktu, cenaProduktu, dostawca));

                }else if (rodzaj.equals("ciuchy")){
                    dataManager.listaCiuchowNaSprzedaz.add(new ciuchyNaSprzedaz(nazwaProduktu, cenaProduktu, dostawca));
                } else if (rodzaj.equals("ksiazki")) {
                    dataManager.listaKsiazekNaSprzedaz.add(new ksiazkiNaSprzedaz(nazwaProduktu, cenaProduktu, dostawca));
                }else {
                    System.out.println("Nieprawidlowy dostawca");
                }


            case 2:

                break;

            case 3:

                break;

            case 4:
                Scanner scanner = new Scanner(System.in);
                System.out.print("Podaj rodzaj produktu, który chcesz wyszukać (agd / rtv / ciuchy / ksiazki): ");
                rodzaj = scanner.nextLine();

                if (rodzaj.equals("agd")) {
                    if (dataManager.listaAgdNaSprzedaz.isEmpty()) {
                        System.out.println("Brak produktów AGD na sprzedaż.");
                    } else {
                        System.out.println("Lista produktów AGD na sprzedaż:");
                        for (agdNaSprzedaz produkt : dataManager.listaAgdNaSprzedaz) {
                            System.out.println(produkt);
                        }
                    }

                } else if (rodzaj.equals("rtv")) {
                    if (dataManager.listaRtvNaSprzedaz.isEmpty()) {
                        System.out.println("Brak produktów RTV na sprzedaż.");
                    } else {
                        System.out.println("Lista produktów RTV na sprzedaż:");
                        for (rtvNaSprzedaz produkt : dataManager.listaRtvNaSprzedaz) {
                            System.out.println(produkt);
                        }
                    }

                } else if (rodzaj.equals("ciuchy")) {
                    if (dataManager.listaCiuchowNaSprzedaz.isEmpty()) {
                        System.out.println("Brak ubrań na sprzedaż.");
                    } else {
                        System.out.println("Lista ubrań na sprzedaż:");
                        for (ciuchyNaSprzedaz produkt : dataManager.listaCiuchowNaSprzedaz) {
                            System.out.println(produkt);
                        }
                    }

                } else if (rodzaj.equals("ksiazki")) {
                    if (dataManager.listaKsiazekNaSprzedaz.isEmpty()) {
                        System.out.println("Brak książek na sprzedaż.");
                    } else {
                        System.out.println("Lista książek na sprzedaż:");
                        for (ksiazkiNaSprzedaz produkt : dataManager.listaKsiazekNaSprzedaz) {
                            System.out.println(produkt);
                        }
                    }

                } else {
                    System.out.println("Nieprawidłowy rodzaj produktu!");
                }

                break;

            case 5:

                break;



        }

        double cena = scWyborProdukty.nextDouble();
        String dostawcaDoWyszukania = scWyborProdukty.nextLine();
        String dostawca = "";
        return "";
    }






    public String archiwum() {

        Scanner sc3 = new Scanner(System.in);

        System.out.println("Podaj co chcesz zrobic dalej");
        System.out.println("Wyświetl historie Dzialan [1]powrót [2]");

        int response3 = sc3.nextInt();

        switch (response3) {



            case 1:
                System.out.println(historiaDzialan.historiaDzialan);

                break;

            /*Zakoncz*/

            case 2:

                break;
        }
        return "";
    }

    public String hurtownicyDostawcyPracownicy(){

        Scanner sc4 = new Scanner(System.in);

        System.out.println("Podaj co chcesz zrobic dalej");
        System.out.println("Działaj na Hurtownikach [1] Działaj na Dostawcach [2] Działaj na Pracownikach [3] powrót [4]");

        int response4 = sc4.nextInt();

        switch (response4) {

            /*Działania na Hurtownikach*/

            case 1:
                Scanner sc5 = new Scanner(System.in);
                System.out.println("Dodaj Hurtownika [1] Usun Hurtownika [2] Zmien Hurtownika [3] Wyswietl Hurtownikow [4] powrót [5]");

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
                                historiaDzialan.historiaDzialan.add("\nDodano Hurtownika: \n" +"Nazwa Hurtownika: "+nazwaHurtownika+"\nprocentZnizkiNaHurt: "+procentZnizkiNaHurt+"\n");
                        }else {
                            System.out.println("Pola nie moga byc puste");
                        }




                        break;

                    case 2:

                        System.out.println("Podaj nazwe hurtownika");
                        String nazwaHurtownikaDoUsuniecia = scHurtownicy.nextLine();


                        dataManager.listaHurtownikow.removeIf(h -> Objects.equals(h.getNazwaHurtownika(), nazwaHurtownikaDoUsuniecia));
                        System.out.println("Usunięto Hurtownika");
                        historiaDzialan.historiaDzialan.add("\nUsunięto Hurtownika:\n" +"Nazwa Hurtownika: "+nazwaHurtownikaDoUsuniecia+"\n");


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
                                        historiaDzialan.historiaDzialan.add("\nZmieniono Hurtownika:\n" +"Nazwa Hurtownika: "+nazwaHurtownikaDoEdycji+"\nAkcja: "+"Zmiana Nazwy"+"\nNowa Nazwa: "+nowaNazwaHurtownika+"\n");
                                    } else {
                                        System.out.println("Nazwa Hurtownika nie moze byc pusta");
                                    }


                                } else if (wyborEdycjaHurtownika == 2){
                                    System.out.println("Podaj nowa znizke procentowa na hurt (Format: 00:00)");
                                    double nowaZnizkaHurtownika = scEdycjaHurtownika.nextDouble();

                                    if (nowaZnizkaHurtownika >= 0 && nowaZnizkaHurtownika <= 100){
                                        Double staryProcentZnizkiHurt = h.getProcentZniznkiHurt();
                                        h.setProcentZniznkiHurt(nowaZnizkaHurtownika);
                                        historiaDzialan.historiaDzialan.add("\nZmieniono Hurtownika:\n" +"Nazwa Hurtownika: "+nazwaHurtownikaDoEdycji+"\nAkcja: "+"Zmiana Procentu Zniżki"+"\nStary Procent Zniżki: "+staryProcentZnizkiHurt+"\nNowy Procent Zniżki: "+nowaZnizkaHurtownika+"\n");
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
                    if(!dataManager.listaHurtownikow.isEmpty()) {
                        for (hurtownicy h : dataManager.listaHurtownikow) {
                            System.out.println(h);
                            historiaDzialan.historiaDzialan.add("\nPróba Wyświetlenia Hurtowników: "+"Udana"+"\n");
                        }
                    }else if(dataManager.listaHurtownikow.isEmpty()) {
                        System.out.println("Lista Pracowników Jest Pusta");
                        historiaDzialan.historiaDzialan.add("\nPróba Wyświetlenia Hurtowników: "+"Nieudana(Lista Hurtowników Jest Pusta)"+"\n");
                    }

                        break;

                    case 5:

                        break;



                }


                break;

            /*Działania na Dostawcach*/


            case 2:

                Scanner sc6 = new Scanner(System.in);
                System.out.println("Dodaj Dostawce [1] Usun Dostawce [2] Zmien Dostawce [3] Wyswietl Dostawców [4] powrót [5]");

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
                                historiaDzialan.historiaDzialan.add("\nDodano Dostawce: \n" +"Nazwa Dostawcy: "+nazwaDostawcy+"\nRodzaj Towaru: "+rodzajTowaru+"\n");
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
                        System.out.println("Usunięto Dostawce");
                        historiaDzialan.historiaDzialan.add("\nUsunięto Dostawce:\n" +"Nazwa Dostawcy: "+nazwaDostawcyDoUsuniecia+"\n");

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
                                        historiaDzialan.historiaDzialan.add("\nZmieniono Dostawce:\n" +"Nazwa Dostawcy: "+nazwaDostawcyDoEdycji+"\nAkcja: "+"Zmiana Nazwy"+"\nNowa Nazwa: "+nowaNawzaDostawcy+"\n");
                                    } else {
                                        System.out.println("Nazwa nie moze byc pusta");
                                    }


                                } else if (wyborEdycjaDostawcow == 2) {
                                    System.out.println("Podaj towar nowy (agd, rtv, ciuchy, ksiazki)");
                                    String nowaTowarDostawcy = scEdycjaDostawcy.nextLine();
                                    String staryRodzajTowaru = d.getRodzajTowaru();

                                    if (Objects.equals(nowaTowarDostawcy, "agd") || Objects.equals(nowaTowarDostawcy, "rtv") || Objects.equals(nowaTowarDostawcy, "ciuchy") || Objects.equals(nowaTowarDostawcy, "ksiazki")) {
                                        d.setRodzajTowaru(nowaTowarDostawcy);
                                        historiaDzialan.historiaDzialan.add("\nZmieniono Dostawce:\n" +"Nazwa Dostawcy: "+nazwaDostawcyDoEdycji+"\nAkcja: "+"Zmiana Rodzaju Towaru"+"\nStary Rodzaj Towaru: "+staryRodzajTowaru+"\nNowy Rodzaj Towaru: "+nowaTowarDostawcy+"\n");
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

                        if(!dataManager.listaDostawcow.isEmpty()) {
                            for (dostawcy d : dataManager.listaDostawcow) {
                                System.out.println(d);
                                historiaDzialan.historiaDzialan.add("\nPróba Wyświetlenia Dostawców: "+"Udana"+"\n");
                            }
                        }else if(dataManager.listaDostawcow.isEmpty()) {
                            System.out.println("Lista Dostawców Jest Pusta");
                            historiaDzialan.historiaDzialan.add("\nPróba Wyświetlenia Dostawców: "+"Nieudana(Lista Dostawców Jest Pusta)"+"\n");
                        }

                        break;

                    case 5:

                        break;


                }


                break;

            /*Działania na Prawcownikach*/

            case 3:


                Scanner sc7 = new Scanner(System.in);
                System.out.println("Dodaj Pracownika [1] Usun Pracownika [2] Zmien Pracownika [3] Wyswietl Pracownikow [4] powrót [5]");

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
                            historiaDzialan.historiaDzialan.add("\nDodano Pracownika:\n" +"Imie Pracownika: "+imiePracownika+"\nNazwisko Pracownika: "+nazwiskoPracownika+"\n");
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
                        System.out.println("Usunięto Pracownika");
                        historiaDzialan.historiaDzialan.add("\nUsunięto Pracownika:\n" +"Imie Pracownika: "+imiePracownikaDoUsuniecia+"\nNazwisko Pracownika: "+nazwiskoPracownikaDoUsuniecia+"\n");

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
                                        historiaDzialan.historiaDzialan.add("\nZmieniono Pracownika:\n" +"Imie Pracownika: "+imiePracownikaDoEdycji+"\nNazwisko Pracownika: "+nazwiskoPracownikaDoEdycji+"\nAkcja: "+"Zmiana Imienia Pracownika"+"\nNowe Imie: "+noweImiePracownika+"\n");
                                    } else {
                                        System.out.println("Imie nie moze byc puste");
                                    }


                                } else if (wyborEdycjaPracownikow == 2) {
                                    System.out.println("Podaj nowe nazwisko");
                                    String noweNazwiskoPracownika = scEdycjaPracownika.nextLine();

                                    if (!noweNazwiskoPracownika.isEmpty()) {
                                        p.setNazwiskoPracownika(noweNazwiskoPracownika);
                                        historiaDzialan.historiaDzialan.add("\nZmieniono Pracownika:\n" +"Imie Pracownika: "+imiePracownikaDoEdycji+"\nNazwisko Pracownika: "+nazwiskoPracownikaDoEdycji+"\nAkcja: "+"Zmiana Nazwiska Pracownika"+"\nNowe Nazwisko: "+noweNazwiskoPracownika+"\n");
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

                        if(!dataManager.listaPracownikow.isEmpty()) {
                            for (pracownicy p : dataManager.listaPracownikow) {
                                System.out.println(p);
                                historiaDzialan.historiaDzialan.add("\nPróba Wyświetlenia Pracowników: "+"Udana"+"\n");
                            }
                        }else if(dataManager.listaPracownikow.isEmpty()) {
                            System.out.println("Lista Pracowników Jest Pusta");
                            historiaDzialan.historiaDzialan.add("\nPróba Wyświetlenia Pracowników: "+"Nieudana(Lista Pracowników Jest Pusta)"+"\n");
                        }

                        break;

                    case 5:

                        break;


                }
        }











        return "";
    }


    }







