package Functions;
import java.util.*;

//  Write a function that takes in the radius as input and returns the circumference of a circle.


public class Circumference {

    public static double circleCircumference(double r){
        double pi = 3.1415;
        double cir = 2*pi*r;
        return cir;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble();

        double cir = circleCircumference(r);
        System.out.println(cir);
    }    
}
