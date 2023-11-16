import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        // String studentName = scanner.nextLine();

        String onlyLettersRegex = "^[a-zA-Z]+$";
        
        String emailRegex = "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$";

        // while (studentName.matches(onlyLettersRegex) == false) {
        //     System.out.println("Vārds var saturēt tikai burtus");
        //     System.out.println("Ievādiet vārdu vēlreiz");
        //     studentName = scanner.nextLine();
        // }

        String name = RegExp.getValidName(scanner.nextLine());

        
    }
    


        

        


}
