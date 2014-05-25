
import java.util.Scanner;


public class CountSpecifiedWord {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        String[] str = input.nextLine().toLowerCase().split("\\W+");
        String word = input.next().toLowerCase();
        int count = 0;
        
        for (int i = 0; i < str.length; i++) {
            if(str[i].equals(word)) {
                count++;
            }
        }
        System.out.println(count);
    }
}
