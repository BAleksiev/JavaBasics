
import java.util.Scanner;


public class LongestIncreasingSequence {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        String[] str = input.nextLine().split(" ");
        int[] arr = new int[str.length];
        for (int i = 0; i < str.length; i++) {
            arr[i] = Integer.parseInt(str[i]);
        }
        int count = 1;
        int temp = 0;
        int pos = 0;
        
        System.out.print(arr[0] + " ");
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] > arr[i-1]) {
                count++;
            } else {
                count = 1;
                System.out.println();
            }
            System.out.print(arr[i] + " ");
            if(count > temp) {
                temp = count;
                pos = i;
            }
        }
        System.out.println();
        System.out.print("Longest: ");
        
        for (int i = pos - temp + 1; i < pos + 1; i++) {
            if(count == 1) {
                System.out.print(arr[pos-1]);
            } else {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
    }
}
