
import java.util.Scanner;

public class PointsInsideFigure {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        String inputStr = input.nextLine();
        String inputCoords[] = inputStr.split(" ");
        
        float x = Float.parseFloat(inputCoords[0]);
        float y = Float.parseFloat(inputCoords[1]);
        
        if((x >= 12.5 && x <= 22.5) && 
               y >= 6.0 && y <= 13.5) {
            
            if(y <= 8.5 || (y > 8.5 && (x <= 17.6 || x >= 20.0))) {
                System.out.println("Inside");
            } else {
                System.out.println("Outside");
            }
        } else {
            System.out.println("Outside");
        }
    }
}
