package Functions;
import java.util.*;
// Que : Make a function to multiply 2 numbers and return the product 

public class Product {
    public static int calculateProduct(int a,int b){
        return a*b;  
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("Product of 2 numbers is "+ calculateProduct(a, b));
    }
}
