
import java.util.Scanner;

/*
 * Xavier Chelleri
 * Student ID: 991623643
 * SYST10199 - Web Programming 
 */

/**
 *
 * @author xdcb
 */
public class StudentList {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Changed array size to 3
        Student[] students = new Student[3];
        
        System.out.println("Enter students names");
        
        for(int i = 0; i < students.length; i++){
            System.out.println("Enter name of student " + (i + 1));
            String name = input.nextLine();
            Student student = new Student(name);
            students[i] = student;
        }
        String format = "Student name is %s\n";
        for(Student student: students){
            System.out.printf(format, student.getName());
        }
    }
}
