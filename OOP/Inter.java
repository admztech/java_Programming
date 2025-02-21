package OOP;

import java.util.*;

public class Inter {
    public static void main(String[] args) {
        Bear b = new Bear();
        b.Hdiet();
        b.Cdiet();

    }
}

interface Herbivoer {
    void Hdiet();
}

interface Carnivores {
    void Cdiet();

}

class Bear implements Herbivoer, Carnivores {
    public void Hdiet() {
        System.out.println("I have eat the  plants, fruits, and barries");
    }

    public void Cdiet() {
        System.out.println("I can eat the meat");
    }
}

interface ChessPlayer {
    void moves();
}

class Queen implements ChessPlayer {
    public void moves() {
        System.out.println("up, down, right, left, diagonal(in all 4 directions)");
    }
}

class Rook implements ChessPlayer {
    public void moves() {
        System.out.println("Up, down, left, right");
    }
}

class King implements ChessPlayer {
    public void moves() {
        System.out.println("Up, down, left, right, diagonal (by 1 step)");
    }
}