public class funcIntro {

    // ? Function withour parameters
    public static void printHelloWorld() {
        System.out.println("Hello, World!");
        return;
    }

    // ? Function with parameters
    public static int add(int a, int b) {   // Parameters or formal parameters
        return a + b;
    }

    // ? Function to swap two numbers
    public static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After swapping: a = " + a + ", b = " + b);
    }

    // ? Question : Find the product of a and b
    public static int product(int a, int b) {
        return a * b;
    }

    // ? Question : Find the factorial of a number
    public static int factorial(int n) {
        int fact = 1;
        for(int i=1; i<=n; i++) {
            fact = fact * i;
        }
        return fact;
    }
    public static void main(String args[]) {
        // ^ Function is a reuable block of code that performs a specific task. It can be called multiple times with different inputs to produce different outputs. functions help in breaking down complex problems into smaller, manageable pieces, making code more organized and easier to read. They can take parameters (inputs) and return values (outputs) based on the logic defined within the function body.
        
        printHelloWorld();

        int sum = add(6, 4);    // Arguments or actual parameters
        System.out.println("The sum of 6 and 4 is: " + sum);

        // * What happens in memory (Call stack)
        // ? When a function is called, a new frame is created on the call stack to hold the function's local variables and parameters. The function executes its code, and when it reaches a return statement or the end of the function, it pops the frame off the stack and returns control to the caller. This allows for nested function calls and recursion, as each function call creates its own frame on the stack.

        // * Call by value vs Call by reference
        // ? In Java, all primitive data types (int, float, etc.) are passed by value, meaning that a copy of the variable is passed to the function. Changes made to the parameter inside the function do not affect the original variable outside the function. However, for objects (like arrays or custom classes), Java passes a reference to the object, which means that changes made to the object inside the function will affect the original object outside the function.

        int a = 5, b = 10;
        
        swap(a, b);

        System.out.println("After calling swap function: a = " + a + ", b = " + b); // Values of a and b remain unchanged outside the swap function

        int prod = product(a, b);
        System.out.println("The product of " + a + " and " + b + " is: " + prod);

        // ^ Factorial of n
        int factorial = factorial(5);
        System.out.println("Factorial : " + factorial);

    }
    
}
