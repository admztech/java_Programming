package OOP;

import java.util.*;

public class ConstructorOop {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("Adnan");
        Student s = new Student(10);

    }

}

class Student {
    private String name;
    private int roll;

    Student() {
        System.out.println("Non parameterised constructor");
    }

    Student(String name) {
        this.name = name;

    }

    Student(int roll) {
        this.roll = roll;
    }
}