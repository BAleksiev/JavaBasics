
import java.util.Scanner;

public class Generate3LetterWords {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        String word = input.nextLine();
        char letters[] = word.toCharArray();
        int len = letters.length;
        
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                for (int k = 0; k < len; k++) {
                    System.out.printf("%s%s%s ", letters[i], letters[j], letters[k]);
                }
            }
        }
        
        System.out.println();
    }
}
