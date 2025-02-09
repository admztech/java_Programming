package Array;

public class DeckCard {
    public static void storedDeckCard(String deck[]) {
        String[] rang = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "A", "J", "Q", "K" };
        String[] suit = { "Spades", "Heart", "Dimind", "club" };

        // Outer loop for suits
        for (int i = 0; i < rang.length; i++) {
            // Inner loop for ranks
            for (int j = 0; j < suit.length; j++) {
                int index = i + 13 * j;
                deck[index] = rang[i] + " " + suit[j];
            }
        }
    }

    public static void main(String[] args) {
        String[] deck = new String[52];
        storedDeckCard(deck);
        for (int i = 0; i < deck.length; i++) {
            int r = i + (int) (Math.random() * (52 - i));
            String t = deck[r];
            deck[r] = deck[i];

        }
        System.out.println();
        for (int i = 0; i < deck.length; i++) {
            // System.out.print(deck[i] + " ");
        }
        for (int i = 0; i <= 52; i++) {
            int r = (int) (i + (Math.random() * (10 - i)));
            System.out.print(r + " ");
        }

    }
}
