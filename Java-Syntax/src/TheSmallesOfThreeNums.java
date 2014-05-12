
import java.util.Scanner;

public class TheSmallesOfThreeNums {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        float a = Float.parseFloat(input.next());
        float b = Float.parseFloat(input.next());
        float c = Float.parseFloat(input.next());
        
        float small = Math.min(a, Math.min(b, c));
        
        System.out.println(small);
    }
}
