import java.util.Scanner;
public class Questions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // * Question 1: In a program, input 3 numbers: A, b, and C. You have to output the average of these 3 numbers.
        // int A = sc.nextInt();
        // int B = sc.nextInt();
        // int C = sc.nextInt();
        // System.out.println((A + B + C)/ 3);


        //* Question 2: In a program, input the side of a square. You have to output the area of the square.
        // int side = sc.nextInt();
        // System.out.println("Area of Square: " + side * side);

        //* Question 3: Enter cost of 3 items from the user (using float data type) - a pencil, a pen and an eraser. You have to output the total cost of these 3 items back t the user as their bill. (Add on: You can also try adding 18% GST to the items in the bill as an advanced problem).
        // float pencil = sc.nextFloat();
        // float pen = sc.nextFloat();
        // float eraser = sc.nextFloat();
        // float totalCost = pencil + pen + eraser;
        // System.out.println("Total Cost: " + totalCost);
        // float gst = totalCost * 0.18f;
        // System.out.println("Total Cost with GST: " + (totalCost + gst));

        // * Question 4: What will be the type of result in the following Java code?
        byte b = 4;
        char c = 'a';
        short s = 512;
        int i = 1000;
        float f = 3.14f;
        double d = 99.9954;

        System.out.println((f * b) + (i % c) - (d * s));
        //? The answer is double because that's the largest datatype among these. So, when the expression gets evaluated via type promotion the value will be of largest datatype i.e. double

        // * Question 5: Will the following statement give an error in Java?
        int $ = 24;
        System.out.println($);
        //? No. Becuase every programming language follows variable naming conventions. 
        //? 1. The varible name should start from a character.
        //? 2. It should only contain letters, numbers, and underscore.
        //? 3. No whitespace, or special characters except "$" are aloud in the name.
        sc.close();
    }
}
