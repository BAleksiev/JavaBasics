
import java.util.Scanner;


public class CountAllWords {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        String[] str = input.nextLine().split("\\W+");
        System.out.println(str.length);
    }
}
