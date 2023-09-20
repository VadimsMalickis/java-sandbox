import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception { // main method
        
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> travelItemList = new ArrayList<String>();
        boolean programIsRunning = true;

        while (programIsRunning == true) {
            System.out.println("Choose action: add, remove or show");
    
            String command = scanner.nextLine();
    
            switch (command) {
                case "add":
                    System.out.println("Type item name to add");
                    travelItemList.add(scanner.nextLine());
                    break;
    
                case "remove":
                    System.out.println("Type item name to remove");
                    String itemToRemove = scanner.nextLine();
                     for (String item : travelItemList) {
                        if (item.equals(itemToRemove)) {
                            travelItemList.remove(itemToRemove);
                        }
                    }
                    break;
                case "show":
                    System.out.println("Total items: " + travelItemList.size());
                    for (String item : travelItemList) {
                        System.out.println(item);
                    }
                    break;
                case "exit":
                    System.out.println("Exit program....");
                    programIsRunning = false;
            }
        }

    }
        
        

}
