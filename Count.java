package Functions;
import java.util.*;

import javax.sound.sampled.SourceDataLine;



public class Count {
    public static void main(String[] args) {
        int post = 0;
        int neg = 0;
        int zero = 0;
        char choice = 'y';
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        do {
            if (n == 0){
                zero = zero +1;
            }
            else if (n < 0){
                neg = neg + 1;
            }
            else{
                post = post +1;
            }
            System.out.println("Enter 'Y' if you wish to continue else enter 'N'!");
            choice = sc.next().charAt(0);

        }while(choice == 'Y' || choice == 'y');
        System.out.println("Positive"+post);
        System.out.println("Negativ"+neg);
        System.out.println("Zero"+zero);
    } 
}
