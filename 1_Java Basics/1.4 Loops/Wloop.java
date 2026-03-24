import java.util.*;
public class Wloop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int i = 0;
        // while(i < 10) {
        //     System.out.println("Hello World");
        //     i++;
        // }
        
        // & Question: Print numbers from 1 to 10
        // int num = 1;
        // while(num <= 10) {
        //     System.err.print(num + " ");
        //     num++;
        // }
        // System.out.println();

        // & Print numbers from 1 to n
        // int n = sc.nextInt();
        // int i = 1;
        // while(i <= n) {
        //     System.out.print(i + " ");
        //     i++;
        // }
        // System.out.println();

        // & Print sum of first n natural numbers
        int n= sc.nextInt();
        int i = 1;
        int sum = 0;
        while (i <= n) {
            sum += i;
            i++;
        }
        System.out.print("Sum of " + n + " natural numbers: " + sum);

        sc.close();
    }
    
}
