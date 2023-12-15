package rvt;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class StudentCsvManager {

    public static final String  STUDENT_CSV = "/workspaces/java-sandbox/data/students.csv";

    public static ArrayList getAllStudents() {

        // Create a List to store the CSV data
        ArrayList<Student> studentList = new ArrayList<>();

        // Read each line of the CSV file
        String line;

        try {
            BufferedReader reader = new BufferedReader(new FileReader(STUDENT_CSV));         
            // skip first line with header names
            reader.readLine();
            
            while ((line = reader.readLine()) != null) {
                // Split the line on the comma delimiter
                String[] lineSplit = line.split(", ");

                Student student = new Student(lineSplit[0], lineSplit[1], lineSplit[2], lineSplit[3]);
    
                // Add the values to the List
                studentList.add(student);
            }
    
            // Close the BufferedReader object
            reader.close();
            
        } catch (IOException e) {
            System.out.println("CSV file not found!");
        }


       return studentList;
    }

   

     public void addStudentsToCSV(ArrayList<Student> studentList) throws IOException {
        // veidojam writeri
        BufferedWriter writer = new BufferedWriter(
                new FileWriter(STUDENT_CSV, true)
            );
            // Write data
            for (Student student : studentList) {
                writer.write(
                    String.format("%s, %s, %s, %s",
                    student.name,
                    student.surname,
                    student.email, 
                    student.group)
                );
                writer.newLine();
            }
            writer.close();
    }

     public static boolean removeSingleStudent(Student student) {
        return true;
    }
}
