
import java.util.Scanner;

public class RectangleArea {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        String inputStr = input.nextLine();
        String params[] = inputStr.split(" ");
        
        int width = Integer.parseInt(params[0]);
        int height = Integer.parseInt(params[1]);
        
        System.out.println(width * height);
        
    }
}
