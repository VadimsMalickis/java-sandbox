import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        ArrayList<Student> studentList = StudentCsvManager.getAllStudents();

        for (Student student : studentList) {
            System.out.println(student.getName());
        }

        Sorter sorter = new Sorter();

        Scanner scanner = new Scanner(System.in);

        sorter.drawTriangle();

    }

}
