import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num = sc.nextLong();

        // Write your solution here.
        // Print the single-digit result of repeatedly summing num's digits.
        long temp;

        while(num >= 10){
            temp = 0;
            while(num > 0){
                temp += num % 10;
                num /= 10;
            }
            num = temp;
        }
        System.out.print(num);
    }
}
