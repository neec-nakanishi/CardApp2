import java.util.Scanner;

public class Player {
    Card turn(Card[] cards) {
        // Enterキーを押したらサイコロを振るようにする
        Scanner scan = new Scanner(System.in);
        scan.nextLine();
        int rnd = (int)(Math.random() * cards.length);
        return cards[rnd];
    }
}
