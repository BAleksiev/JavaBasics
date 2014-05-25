
import java.util.Scanner;

public class LargestSequenceOfEqualStrings {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String[] arr = input.nextLine().split(" ");
        int pos = 0;
        int count = 1;
        int temp = 1;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i].equals(arr[i - 1])) {
                count++;
            } else {
                count = 1;
            }
            if(count > temp) {
                temp = count;
                pos = i;
            }
        }
        
        for (int i = 0; i < temp - 1; i++) {
            System.out.print(arr[pos] + " ");
        }
        System.out.println(arr[pos]);
    }
}
