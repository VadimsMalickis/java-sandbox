import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Backpack {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);


        
        List<String> mantas = new ArrayList<>();

        while (true) {
            System.out.println("Izvēlies darbību: add, exit, check, remove");
            String choice = sc.next();
                //šeit pievieno lietu 
            if (choice.equals("add")) {
                // 
                System.out.print("lietas nosaukums: ");
                mantas.add(sc.next());
                System.out.println("lieta pievienota!");
                //šeit noņem lietu
            }
            else if (choice.equals("remove")) {
                System.out.print("Lietas nosaukums dzēšanai: ");
                String nosaukums = sc.next();
                if (mantas.remove(nosaukums)) {
                    System.out.println("Lieta dzēsta!");
                } else {
                    System.out.println("Lieta nav sarakstā!");
                }
                //šeit pārbauda izveidoto sarakstu
            } else if (choice.equals("check")) {
                System.out.println("Lietu saraksts: " + mantas);
            } else if (choice.equals("exit")) {
                    System.out.println("Programma beigta.");
                    sc.close();
                    break;
            } else {
                System.out.println("Nepareiza darbība. Lūdzu, izvēlieties no dotajām opcijām.");
            }
        }
    }
}
