import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        
        ArrayList<Student> studentList = StudentCsvManager.getAllStudents();

        for (Student student : studentList) {
            System.out.println(student.getName());
        }


    }
        

}
