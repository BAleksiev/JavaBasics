
import java.util.Scanner;

public class CountOfBitsOne {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int n = input.nextInt();
        char[] bin = Integer.toBinaryString(n).toCharArray();
        int count = 0;
        
        for (int i = 0; i < bin.length; i++) {
            if(bin[i] == '1') {
                count++;
            }
        }
        
        System.out.println(count);
    }
}
