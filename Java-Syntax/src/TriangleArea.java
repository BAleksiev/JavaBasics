
import java.util.Scanner;

public class TriangleArea {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int coords[][] = new int[3][2];
        int sum = 0;
        
        for (int i = 0; i < 3; i++) {
            String inputStr = input.nextLine();
            String params[] = inputStr.split(" ");
            
            coords[i][0] = Integer.parseInt(params[0]);
            coords[i][1] = Integer.parseInt(params[1]);
        }
        
        sum = ((coords[0][0] * (coords[1][1] - coords[2][1])) + (coords[1][0] * (coords[2][1] - coords[0][1])) + 
                (coords[2][0] * (coords[0][1] - coords[1][1]))) / 2;
        
        System.out.println(Math.abs(sum));
    }
}
