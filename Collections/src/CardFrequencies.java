
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;


public class CardFrequencies {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        String[] str = input.nextLine().split("\\W+");
        Map<String, Integer> words = new TreeMap<>();
        
        int maxCount = 0;
        for (String word : str) {
            
            Integer count = words.get(word);
            
            if (count == null) {
                count = 0;
            }
            
            if (count + 1 > maxCount) {
                maxCount = count + 1;
            }
            words.put(word, count + 1);
        }
    }
}
