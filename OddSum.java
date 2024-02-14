package Functions;
import java.util.*;

// Write a function to print the sum of all odd numbers from 1 to n

public class OddSum{
    
    public static void main(String[] args) {
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=1 ; i <= n;i++){
            if (i%2 != 0 ){
                sum = sum+i;
            }
        }System.out.println(sum);
    }
}
