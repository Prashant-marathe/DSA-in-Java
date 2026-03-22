public class TypeConversion {
    public static void main(String[] args) {
        // & Type Conversion in Java : Type conversion is the process of converting one data type to another. In Java, there are two types of type conversion: implicit and explicit.

        // ^ Type conversion happens when:
        // ^ 1. Types of two variables are compatible like int and double but not like int to boolean.
        // ^ 2. destination type > source type. For example, double > int but not int > double.

        // ? There are 2 types of type conversion in Java:
        // ? 1. Implicit Type Conversion (Widening)
        // ? 2. Explicit Type Conversion (Narrowing)

        // ? 1. Implicit Type Conversion (Widening) : Implicit type conversion, also known as widening, occurs when a smaller data type is automatically converted to a larger data type. This happens when the destination type can accommodate all possible values of the source type without losing information. For example, when an int is assigned to a double, the int is automatically converted to a double without any explicit cast.
        int a = 10;     
        double b = a;
        System.out.println(a);    // Output: int
        System.out.println(b);    // Output: double

        // ? Implicit type conversion follows the following order:
        // byte -> short -> int -> long -> float -> double

        // ? 2. Explicit Type Conversion (Narrowing) : Explicit type conversion, also known as narrowing, occurs when a larger data type is explicitly converted to a smaller data type. This requires a cast operator to be used to indicate that the programmer is aware of the potential loss of information. For example, when a double is assigned to an int, the double must be explicitly cast to an int, which may result in truncation of the decimal part.
        double c = 10.5;    
        int d = (int) c;
        System.out.println(c);    // Output: double
        System.out.println(d);    // Output: int (truncated value)

        // & Type promotion in Expressions :
        // & 1. Java automatically promotes each byte, short, or char operand to int when evaluating an expression. If any operand is of type long, float, or double, the entire expression is promoted to that type.
        byte x = 5; 
        byte y = 10;
        int z = x + y;   // x and y are promoted to int before addition
        System.out.println(z);    // Output: int

        // & 2. If an expression contains a mix of data types, Java promotes the smaller type to the larger type to prevent data loss. For example, if an expression contains both int and double, the int will be promoted to double before the operation is performed.    

        int m = 5;
        double n = 10.5;
        double result = m + n;   // m is promoted to double before addition
        System.out.println(result);   // Output: double
    }
    
}
