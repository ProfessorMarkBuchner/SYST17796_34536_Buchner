/*
 * Mehrab Zamanudin
 * Student ID:
 * SYST10199 - Web Programming
 */
package studentlist;

/**
 *This class represents students in our application
 * @author zaman
 */
public class Student {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}
