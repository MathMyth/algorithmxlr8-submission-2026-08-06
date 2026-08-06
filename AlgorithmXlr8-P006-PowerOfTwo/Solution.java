import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();

        // Write your solution here.
        // Print "true" if n is a power of two, otherwise print "false".
        if(n <= 0) System.out.print("false");  //any number <= 0 are not power of 2 (definition)
        else if(n == 1) System.out.print("true");  //2 ^ 0 = 1. hence, 1 is a power of 2

        //for rest all cases we'll do num & 1 and check if that equals to 1 => odd(false) otherwise even(true)
        else if((n & 1) == 1) System.out.print("false");
        else System.out.print("true");
    }
}
