import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DaysBetweenTwoDates {

    public static void main(String args[]) throws ParseException {

        Scanner in = new Scanner(System.in);
        String input1 = in.nextLine();
        String input2 = in.nextLine();

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");
        Date date1 = simpleDateFormat.parse(input1);
        Date date2 = simpleDateFormat.parse(input2);

        double diff;
        diff = date2.getTime() - date1.getTime();
        double result = Math.floor(diff / (86400.0 * 1000.0));

        System.out.println((long)result);
    }
}
