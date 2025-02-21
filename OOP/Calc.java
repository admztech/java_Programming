package OOP;

import java.util.*;

public class Calc {

    public static void main(String[] args) {
        Calculator c1 = new Calculator();
        System.out.println(c1.sum(1, 2));
        System.out.println(c1.sum(1.5f, 1.5f));
        System.out.println(c1.sum(1, 2, 12));
        Animal a1 = new Animal();
        a1.eat();
        Deer d1 = new Deer();
        d1.eat();

    }
}

class Animal {
    void eat() {
        System.out.println("Eat");
    }
}

class Deer extends Animal {
    void eat() {
        System.out.println("Eat Grass");
    }
}

class Calculator {
    int sum(int a, int b) {
        return a + b;
    }

    float sum(float a, float b) {
        return a + b;
    }

    int sum(int a, int b, int c) {
        return a + b + c;
    }
}