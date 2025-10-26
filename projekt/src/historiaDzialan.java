import java.util.ArrayList;
import java.util.Scanner;

public class historiaDzialan {


    public static ArrayList<String> historiaDzialan = new ArrayList<>();

    public static void wyswietlHistorieDzialan(){
        Scanner sc3 = new Scanner(System.in);

        System.out.println("Podaj co chcesz zrobic dalej");
        System.out.println("Wyświetl historie Dzialan [1]powrót [2]");

        int response3 = sc3.nextInt();

        switch (response3) {



            case 1:
                System.out.println(historiaDzialan);

                break;

            /*Zakoncz*/

            case 2:

                break;
        }
    }


}

