
import java.util.Scanner;

public class DecimalToHexadecimal {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int num = input.nextInt();
        
        System.out.println(Integer.toHexString(num).toUpperCase());
        
    }
}
