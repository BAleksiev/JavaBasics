
import java.io.BufferedReader;
import java.io.FileReader;

public class SumNumbersFromTextFile {

    public static void main(String[] args) {

        try {
            BufferedReader reader = new BufferedReader(new FileReader("input.txt"));

            int sum = 0;
            String row;
            
            while ((row = reader.readLine()) != null) {
                sum += Integer.parseInt(row);
            }
            reader.close();
            
            System.out.println(sum);

        } catch (Exception e) {
            System.out.println("Error");
        }

    }
}
