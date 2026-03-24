import java.util.*;
public class Questions {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // Question 1: How may times "Hello" is printed
        for(int i=0; i<5; i++) {
            System.out.println("Hello");
            i+=2;   // ^ 2 times
        }

        // Question 2: Write a program that reads a set of integers, and then prints the sum of the even and odd integers.
        int number;
        int choice;
        int evenSum = 0;
        int oddSum = 0;

        do {
            System.out.print("Enter the number: ");
            number = sc.nextInt();

            if(number % 2 == 0) {
                evenSum += number;
            }else{
                oddSum += number;
            }

            System.out.println("Do you want to continue?\n Press 1 for yes or 0 for no.");
            choice = sc.nextInt();
        }while(choice == 1);

        System.out.println("Sum of even numbers: " + evenSum);
        System.out.println("Sum of odd numbers: " + oddSum);
        
        // Question 3: Write a program to find the factorial of any number entered by the user.
        int num;
        int fact = 1;

        System.out.print("Enter any positive number: ");
        num = sc.nextInt();

        for(int i=1; i<=num; i++){
            fact *= i;
        }
        System.out.println("Factorial: " + fact);

        // Question 4: Write a program to print the multiplication table of a number N, entered by the user.
        // int num = sc.nextInt();
        // int i = 1;
        // while(i <= 10) {
        //     System.out.println(i * num);
        //     i++;
        // }

        // Question 5: What is wrong in the following program?
        for(int i=0; i<=5; i++){    
            System.out.println("i = " + i); 
        }

        // System.out.println("i after the loop = " + i); // ^ since i is declared inside the loop it cannot be accessed outside of that loops scope
    }   
}
