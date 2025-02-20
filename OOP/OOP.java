package OOP;

public class OOP {
    public static void main(String[] args) {
        Animal a1 = new Animal();
        a1.color = "Red";
        Fish f1 = new Fish();
        f1.swim();
        Shark s1 = new Shark();
        s1.eat();

        Peecock p1 = new Peecock();
        p1.fly();
        p1.danc();

    }
}

class Animal {
    String color;

    void breath() {
        System.out.println("Breath");
    }
}

class Fish extends Animal {
    void swim() {
        System.out.println("Swiming");
    }
}

class Shark extends Fish {
    void eat() {
        System.out.println("Eating");

    }
}

class Bird extends Animal {
    void fly() {
        System.out.println("can fly");
    }
}

class Peecock extends Bird {
    void danc() {
        System.out.println("Dancing");
    }
}