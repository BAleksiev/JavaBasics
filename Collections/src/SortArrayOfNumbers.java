
import java.util.Arrays;
import java.util.Scanner;


public class SortArrayOfNumbers {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int n = Integer.parseInt(input.nextLine());
        String inputStr = input.nextLine();
        String[] strArr = inputStr.split(" ");
        int[] arr = new int[n];
        
        for (int i = 0; i < strArr.length; i++) {
            arr[i] = Integer.parseInt(strArr[i]);
        }
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
