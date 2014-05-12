
import java.util.Scanner;

public class FormattingNumbers {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int a = input.nextInt();
        float b = Float.parseFloat(input.next());
        float c = Float.parseFloat(input.next());
        
        System.out.printf("|%-10X|%010d|%10.2f|%-10.3f|%n", a, Integer.parseInt(Integer.toBinaryString(a)), b, c);
    }
}
