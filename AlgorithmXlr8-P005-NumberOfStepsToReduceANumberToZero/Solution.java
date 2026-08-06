import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        // Write your solution here.
        // Print the number of steps to reduce num to zero.
        int counter = 0;

        while(num != 0){
            if(num % 2 == 0){
                num = num / 2;
            }else{
                num = num - 1;
            }
            counter++;
        }
        System.out.print(counter);
    }
}
