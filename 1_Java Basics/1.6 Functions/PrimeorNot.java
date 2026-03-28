import java.util.*;
public class PrimeorNot{

    // ^ Function to check if a number is prime or not
    public static boolean isPrime(int n) {
        // Corner cases: if n = 2
        if(n == 2) {
            return true;
        }

        for(int i=2; i<=n-1; i++) {
            if(n % i == 0) {   // Check if number is divisible by other numbers 
                return false;   // Return false if number is divisible by numbers other than 1 and itself. In such case, number is not prime.
            }	
        }
        return true;    // return true. Since the number is not divisible by any other numbers its prime;
    }
    
    // ^ Optimized approach 
    public static boolean isPrimeOptimized(int n) {
        if(n <= 1) {
            return false;
        }
        if(n == 2) {
            return true;
        }
        for(int i=2; i<=Math.sqrt(n); i++) {
            if(n % i == 0) {
                return false;
            }
        }
        return true;
    }

    // ^ Question : Print all prime numbers between 1 and n
    public static void primesInRange(int n) {
        for(int i=2; i<=n; i++) {
            if(isPrimeOptimized(i)) {
                System.out.print(i + " ");
            }
        }
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        // System.out.println(isPrime(n));
        // System.out.println(isPrimeOptimized(n));

        // ^ Print all prime numbers between 1 and n
        primesInRange(n);

        sc.close();
    }
}