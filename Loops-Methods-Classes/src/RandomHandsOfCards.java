import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class RandomHandsOfCards {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n = Integer.parseInt(input.nextLine());

        String[] cards = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
        String[] suits = {"♣", "♦", "♥", "♠"};
        String[] allCards = new String[52];
        
        int count = 0;
        for (int i = 0; i < cards.length; i++) {
            for (int j = 0; j < 4; j++) {
                allCards[count] = cards[i] + suits[j];
                count++;
            }
        }
        
        List<String> allCardsList = Arrays.asList(allCards);
        for (int i = 0; i < n; i++) {
            Collections.shuffle(allCardsList);
            List<String> selectedCards = allCardsList.subList(0, 5);
            System.out.println(selectedCards.toString());
        }
    }
}
