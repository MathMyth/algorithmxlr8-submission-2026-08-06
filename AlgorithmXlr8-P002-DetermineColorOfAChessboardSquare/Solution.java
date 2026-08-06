import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String coordinates = sc.next();

        // Write your solution here.
        if(coordinates.charAt(0) == 'a' || coordinates.charAt(0) == 'c' || coordinates.charAt(0) == 'e' || coordinates.charAt(0) == 'g' )
        {
            if(Character.getNumericValue(coordinates.charAt(1)) % 2 == 0) System.out.print("White");
            else System.out.print("Black");

        }else{
            if(Character.getNumericValue(coordinates.charAt(1)) % 2 == 0) System.out.print("Black");
            else System.out.print("White");
        }
        // Print "White" or "Black".
    }
}
