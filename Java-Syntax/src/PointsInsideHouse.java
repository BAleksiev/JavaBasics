
import java.util.Scanner;

public class PointsInsideHouse {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String inputStr = input.nextLine();
        String data[] = inputStr.split(" ");

        double x = Float.parseFloat(data[0]);
        double y = Float.parseFloat(data[1]);
        
        double leftSide = ( (12.5 - 17.5)*(y - 3.5) - (8.5 - 3.5)*(x - 17.5) );
        double rightSide = ( (22.5 - 17.5)*(y - 3.5) - (8.5 - 3.5)*(x - 17.5) );
        
        boolean leftRoof = leftSide <= 0.0;
        boolean rightRoof = rightSide >= 0.0;
        boolean roof = leftRoof == true && rightRoof == true && y <= 8.5;
        
        boolean leftWall = y >= 8.5 && y <= 13.5 && x >= 12.5 && x <= 17.5;
        boolean rightWall = y >= 8.5 && y <= 13.5 && x >= 20 && x <= 22.5;
        boolean walls = leftWall == true || rightWall == true;
        
        if(roof == true || walls == true) {
            System.out.println("Inside");
        } else {
            System.out.println("Outside");
        }
    }
}
