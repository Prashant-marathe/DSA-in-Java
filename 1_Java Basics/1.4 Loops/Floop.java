public class Floop{
    public static void main(String args[]) {
        // for(int i = 0; i < 10; i++) {
        //     System.out.println("Hello World");
        // }

    // & Print square pattern
    /*
        * * * *
        * * * *
        * * * *
        * * * * 
     */
        // int n = 10;
        // for(int i = 1; i <= n; i++) {
        //     for(int j = 1; j<=n; j++) {
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }

    // & Print reverse of a number
        // int n = 483484833;
        // while(n > 0){
        //     int lastDigit = n % 10;     // ^ Get the last digit 
        //     System.out.print(lastDigit);
        //     n = n/10;   // ^ Remove the last digit
        // }

    // & Reverse a given number
        int n = 10899;
        int rev = 0;
        while (n > 0) {
            int lastDigit = n % 10;
            rev = (rev * 10) + lastDigit;
            n = n / 10;
        }
        System.out.println(rev);


    


    }
}
