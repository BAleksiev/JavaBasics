
import java.util.Scanner;

public class CountOfEqualBitPairs {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        char[] bin = Integer.toBinaryString(n).toCharArray();
        int count = 0;

        for (int i = 1; i < bin.length; i++) {
            if (bin[i] == bin[i-1]) {
                count++;
            }
        }

        System.out.println(count);
    }
}
