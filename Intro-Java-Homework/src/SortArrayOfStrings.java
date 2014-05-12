import java.util.Arrays;
import java.util.Scanner;

public class SortArrayOfStrings {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int n = input.nextInt();
        
        String[] str = new String[n];
        
        for (int i = 0; i < n; i++) {
            str[i] = input.next();
        }
        
        Arrays.sort(str);
        
        for (int i = 0; i < n; i++) {
            System.out.println(str[i]);
        }
    }
}
