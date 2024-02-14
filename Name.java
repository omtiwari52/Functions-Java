package Functions;
import java.util.*;

// Que : Function to print name 

public class Name {
    //Creating a new function inside the Class    
    public static void printMyName(String name){ 
        System.out.println(name);
        return;  // Returning nothing coz fo void keyword is used
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();

        printMyName(name); // Calling Function 
    }
}


