import java.util.Scanner;
public class TerneryOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // ^ Syntax: 
        // ? variable = condition ? statement1 : statement2;

        //& Which one of the two numbers is larger
        // int larger = (5 > 3) ? 5 : 3;
        // System.out.println(larger);

        int age = 20;
        String result = (age >= 18) ? "You are an adult" : "You are not an Adult";
        System.out.println(result);

        //& Question: Check if a student Pass or Fail
        int marks = sc.nextInt();
        String examResult = (marks >= 33) ? "Pass" : "Fail";
        System.out.println(examResult);

        sc.close();
    }
}
