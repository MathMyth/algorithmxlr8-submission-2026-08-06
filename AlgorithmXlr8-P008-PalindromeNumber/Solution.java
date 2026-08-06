import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();

        // Write your solution here.
        // Print "true" if x is a palindrome, otherwise print "false".
        if(x < 0) System.out.print("false");
        else if((x > 0) && (x % 10 == 0)) System.out.print("false");
        else{
            long rev = 0;
            long org = x;

            while(org != 0){
                rev = (rev * 10) + (org % 10);
                org = org / 10;
            }

            if(rev == x) System.out.print("true");
            else System.out.print("false");
        }
        
    }
}
