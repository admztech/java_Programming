package OOP;

import java.util.*;

public class Stat {

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.printSchoolname();
        Student s2 = new Student();
        s2.scName = "Ideal";
        s2.printSchoolname();
        s1.printSchoolname();

    }
}

class Student {
    String name;
    int roll;
    static String scName = "Jym";

    void printSchoolname() {
        System.out.println(scName);
    }
}