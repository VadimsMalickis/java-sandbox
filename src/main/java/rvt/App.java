package rvt;

import java.util.ArrayList;

public class App 
{
    public static void main( String[] args )
    {
        ArrayList<Student> students = StudentCsvManager.getAllStudents();

        for (Student student : students) {
            System.out.println(student.toJsonString());
        }
    }
}
