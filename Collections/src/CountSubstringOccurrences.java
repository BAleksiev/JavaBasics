
import java.util.Scanner;

public class CountSubstringOccurrences {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String str = input.nextLine().toLowerCase();
        String word = input.next().toLowerCase();
        int count = 0;

        for (int i = 0; i <= str.length() - word.length(); i++) {
            if (str.substring(i, word.length() + i).contains(word)) {
                count++;
            }
        }
        System.out.println(count);
    }
}
