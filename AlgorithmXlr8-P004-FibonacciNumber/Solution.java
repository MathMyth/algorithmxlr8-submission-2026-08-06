import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // Write your solution here.
        // Print F(n).

        int a = 0;
        int b = 1;
        
        if(n == a) System.out.print(a);
        else if(n == b) System.out.print(b);
        else{
            int c = a + b;
            while(n > 2){
                a = b;
                b = c;
                c = a + b;
                n--;
            }
            System.out.print(c);
        }
    }
}
