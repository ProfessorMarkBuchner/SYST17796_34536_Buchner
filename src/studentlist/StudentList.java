/*
 * Mehrab Zamanudin
 * Student ID:
 * SYST10199 - Web Programming
 */
package studentlist;

import java.util.Scanner;

/**
 *This class is a simple example of creating arrays of objects
 * @author zaman
 */
public class StudentList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Student[] students = new Student[2];
        
        Scanner input = new Scanner(System.in);
        
        for(int i =0; i < students.length; i++){
            System.out.println("Enter the student's name");
            String name = input.nextLine();
            Student student = new Student(name);
            
            students[i] = student;
        }
        System.out.println("Printing the students:");
        String format = "The student's name is %s\n";
        for (Student student: students){
            System.out.printf(format, student.getName());
        }
    }
    
}
