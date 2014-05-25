
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;


public class ExtractAllUniqueWords {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        String[] str = input.nextLine().toLowerCase().split("\\W+");
        Set<String> s = new TreeSet<>();
        
        for (int i = 0; i < str.length; i++) {
            s.add(str[i]);
        }
        
        for (String st : s) {
            System.out.println(st);
        }
    }
}
