import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class StudentCsvManager {
    public static ArrayList getAllStudents() {

        // Create a List to store the CSV data
        ArrayList<Student> studentList = new ArrayList<>();

        // Read each line of the CSV file
        String line;

        try {
            BufferedReader reader = new BufferedReader(new FileReader("/workspaces/java-sandbox/data/students.csv"));

            // skip first line with header names
            reader.readLine();
    
            while ((line = reader.readLine()) != null) {
                // Split the line on the comma delimiter
                Student student = new Student();
    
                // Add the values to the List
                studentList.add(student);
            }
    
            // Close the BufferedReader object
            reader.close();
            
        } catch (Exception e) {
            // TODO: handle exception
        }


       return studentList;
    }

   

    public static boolean addStudentToCsv(Student student) {
        // action to add student to our csv file
    }

     public static boolean removeSingleStudent(Student student) {

    }
}
