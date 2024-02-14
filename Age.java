package Functions;
import java.util.*;

// Write a function that takes in age as input and returns if that person is eligible to vote or 
// not. A person of age > 18 is eligible to vote.


public class Age {
    public static void eligibleAge(int a){
        if (a > 18){
            System.out.println("Eligible");
            return;
        }
        else{
            System.out.println("Not Eligible");
        }
        return;
    }   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        eligibleAge(a);
    }
}
