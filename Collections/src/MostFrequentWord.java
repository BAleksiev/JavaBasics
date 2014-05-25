
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class MostFrequentWord {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String[] cards = input.nextLine().toLowerCase().split("\\W+");
        Map<String, Integer> cardsMap = new LinkedHashMap<>();

        for (String card : cards) {
            Integer count = cardsMap.get(card);
            if (count == null) {
                count = 0;
            }
            cardsMap.put(card, count + 1);
        }
        
        for (Map.Entry<String, Integer> entry : cardsMap.entrySet()) {
            System.out.printf("%s -> %.2f%%\n", entry.getKey(), (double) entry.getValue() * 100 / cards.length);
        }
    }
}
