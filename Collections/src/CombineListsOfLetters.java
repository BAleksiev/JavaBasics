
import java.util.ArrayList;
import java.util.Scanner;


public class CombineListsOfLetters {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        String[] str = input.nextLine().split(" ");
        String[] in = input.nextLine().split(" ");
        
        ArrayList<Character> arrList = new ArrayList<>();
        
        for (int i = 0; i < str.length; i++) {
            arrList.add(str[i].charAt(0));
        }
        for (int i = 0; i < in.length; i++) {
            if(arrList.contains(in[i].charAt(0))) {
                continue;
            } else {
                arrList.add(in[i].charAt(0));
            }
        }
        
        System.out.println(arrList);
    }
}
