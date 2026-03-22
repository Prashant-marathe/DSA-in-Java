// * Import Utility package to take user input
import java.util.*;
public class UserInput {
    public static void main(String[] args) {
        /* Create an object of Scanner class to take user input
          Scanner class is used to take input from the user in Java. It is part of the java.util package and provides methods to read different types of input, such as integers, strings, and more.
          To use the Scanner class, you need to create an instance of it and specify the input source (e.g., System.in for console input).
          Once you have a Scanner object, you can use its methods to read various types of input from the user.
         */
        Scanner sc = new Scanner(System.in);

        // ^ Sum of a and b
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(a + b);

        // ^ Product of a and b
        System.out.println(a * b);
        
        //^ Question: Calculate the area of a circle
        //? Area of a circle = π * r^2
        double r = sc.nextDouble();
        double area = Math.PI * r * r;
        System.out.println(area);
        
        sc.close();
    }
    
}
