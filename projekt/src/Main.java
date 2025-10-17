import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        boolean petla = true;

        while (petla){

            System.out.println("Co chcesz zrobic");
            System.out.println("Podkategorie:");
            System.out.println("Zarządzanie Towarem [1] Archiwum [2] Hurtownicy, Dostawcy i Pracownicy [3]  zakończ [5] ");

            Scanner sc = new Scanner(System.in);
            int wybor = sc.nextInt();

            Interfejs i=new Interfejs();
            i.response1(wybor);












        }



    }
}
