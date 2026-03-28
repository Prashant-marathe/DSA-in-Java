public class funcOverloading {

    // ^ Function Overloading: Same function name but different parameters
    public static void multiply(int a, int b) {
        System.out.println(a * b);
    }

    public static void multiply(double a, double b) {
        System.out.println(a * b);
    }

    // ^ We can also change the number of parameters while keeping there type same to perform function overloading
    public static void multiply(int a, int b, int c) {
        System.out.println(a * b * c);
    }
    public static void main(String[] args) {
        multiply(5, 10);
        multiply(5.5, 10.5);
        multiply(5, 10, 15);
    }
}

// & Summary: Function overloading allows us to have multiple funtions with the same name but different parameters. The compiler determines which function to call based on the number and type of arguments passed. This feature enhances code readability and reusability. 