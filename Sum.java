package Functions;
import java.util.*;
// Que : Make a Function to add 2 numbers and return the sum 

public class Sum {
    public static int calculateSum(int a,int b){  // parameters or formal parameters
        int sum = (a+b);
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int sum = calculateSum(a, b); // arguments or actual parameters
        System.out.println("sum of 2 numbers is "+sum);
    }
}