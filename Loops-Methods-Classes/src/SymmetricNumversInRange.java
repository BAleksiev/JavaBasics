
import java.util.Scanner;

public class SymmetricNumversInRange {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        String inputStr = input.nextLine();
        String nums[] = inputStr.split(" ");
        
        for (int i = Integer.parseInt(nums[0]); i <= Integer.parseInt(nums[1]); i++) {
            
            char num[] = Integer.toString(i).toCharArray();
            int numLength = num.length;
            
            boolean isSymmetric = true;
           
            for (int j = 0; j < numLength/2; j++) {
                if(num[j] != num[numLength - (1 + j)]) {
                    isSymmetric = false;
                }
            }

            if(isSymmetric == true) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}
