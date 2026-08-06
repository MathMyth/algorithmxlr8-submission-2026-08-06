import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num = sc.next();

        // Write your solution here.
        // Print the maximum number after changing at most one digit 6 to 9.
        int i = 0;
        String result = num;

        while(i < num.length()){
            if(Character.getNumericValue(num.charAt(i)) == 6){
                StringBuilder sb = new StringBuilder(num);
                sb.setCharAt(i, '9');
                result =  sb.toString();
                break;
            }
            i++;
        }
        
        System.out.print(result);
    }
}