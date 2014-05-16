
import java.util.Scanner;

public class AngleUnitConverter {

    private static String converter(double value, String from) {
        
        String result = "";
        double rad = 57.2957795;
        double deg = 0.0174532925;
        
        if(from.equals("deg")) {
            result = String.format("%.6f rad", value * deg);
        } else if(from.equals("rad")) {
            result = String.format("%.6f deg", value * rad);
        }
        return result;
    }
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int n = Integer.parseInt(input.nextLine());
        String[][] inputs = new String[n][2];
        
        for (int i = 0; i < n; i++) {
            String inputStr = input.nextLine();
            inputs[i] = inputStr.split(" ");
        }
        
        for (String[] in : inputs) {
            System.out.println(converter(Double.parseDouble(in[0]), in[1]));
        }
    }
}
