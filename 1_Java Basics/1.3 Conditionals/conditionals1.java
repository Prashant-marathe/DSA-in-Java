// import java.util.*;
public class conditionals1 {
    public static void main(String args[]) {
        // Scanner sc = new Scanner(System.in);
        // int age = 16;
        // if (age >= 18) {
        //     System.out.println("You are an Adult");
        // }
        // else{
        //     System.out.println("You are not an Adult");
        // }

        // & Question: Print the largest of 2 numbers
        // int A = 1, B = 3;
        // if (A >= B) {
        //     System.out.println("A is greater than B");
        // }else{
        //     System.err.println("B is greater than A");
        // }

        // & Question: Print if a number is odd or even
        // int num = 3;
        // if (num % 2 == 0) {
        //     System.out.println("Number is even");
        // }else{
        //     System.out.println("Number is odd");
        // }

        // & Question using else if
        // int income = sc.nextInt();
        // if (income < 500000){
        //     System.out.println("No tax");
        // }else if(income >= 50000 && income < 1000000){
        //     System.out.println("20 % tax: " + income * 0.20);
        // }else{
        //     System.out.println("30% tax: " + income * 0.30);
        // }

        //& Question: Print the largest of three numbers
        int A = 1, B = 3, C = 6;
        if (A >= B && A >= C) {
            System.out.println("A is greater than B and C");
        }else if(B >= A && B >= C){
            System.out.println("B is greater than A and C");
        }else{
            System.out.println("C is greater than A and B");
        }
    }
}
