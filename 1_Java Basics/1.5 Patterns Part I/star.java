public class star {
    public static void main(String args[]) {
        // ^ We can solve mostly every pattern question using 3 steps
        // ? 1. Number of rows in the pattern   (Outer loop)
        // ? 2. How many times are we printing a star in a row  (Inner Loop)
        // ? 3. What to print

        // & Print star pattern
        /*
        * 
        * *
        * * *
        * * * *
        */
        int n = 4;      // Number of rows
        for(int i=1; i<=n; i++) {   // Inner loop: specifies how many rows there are in the pattern (n=4)
            for(int j=1; j<=i; j++){    // Outer loop: How many times are we printing a star in a row. we are printing i times the star in each row. i.e. 1 star in 1st row, 2 stars in 2nd row and so on
                System.out.print("* ");     // What to print : "*"
            }
            System.out.println();   // Next line after each row
        }
    }
    
}
