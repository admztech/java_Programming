package OOP;

import java.util.*;

public class Iherit {

    public static void main(String[] args) {
        Mammals dog = new Mammals();
        dog.walk();
        dog.eat();
        dog.breath();
        Birds eagle = new Birds();
        eagle.eat();
        eagle.breath();
        eagle.fly();
    }
}

class Animal {
    String color;

    void eat() {
        System.out.println("Eating");
    }

    void breath() {
        System.out.println("Breathing");
    }

}

class Mammals extends Animal {
    void walk() {
        System.out.println("Walk");
    }
}

class fish extends Animal {
    void swin() {
        System.out.println("Swim");
    }
}

class Birds extends Animal {
    void fly() {
        System.out.println("Birs can fly");
    }
}

// class Fish extends Animal {
// int fish;

// void swim() {
// System.out.println("Swming");
// }
// }