public class ArithmeticOperators {
    public static void main(String[] args) {
        // ? Arithmetic Operators in Java : Arithmetic operators are used to perform basic mathematical operations such as addition, subtraction, multiplication, division, and modulus. These operators can be used with numeric data types such as int, float, double, etc. There are 2 types of arithmetic operators in Java:
        // ? 1. Binary Arithmetic Operators 
        // ? 2. Unary Arithmetic Operators

        // ? 1. Binary Arithmetic Operators : Binary arithmetic operators are used to perform operations on two operands. The binary arithmetic operators in Java are:
        // ? a. Addition (+) : The addition operator is used to add two operands.
        int a = 10;
        int b = 5;
        System.out.println(a + b);   // Output: 15

        // ? b. Subtraction (-) : The subtraction operator is used to subtract the second operand from the first operand.
        System.out.println(a - b);   // Output: 5   

        // ? c. Multiplication (*) : The multiplication operator is used to multiply two operands.
        System.out.println(a * b);   // Output: 50

        // ? d. Division (/) : The division operator is used to divide the first operand by the second operand. If both operands are integers, the result will be an integer (truncated value). If either operand is a floating-point number, the result will be a floating-point number.
        System.out.println(a / b);   // Output: 2 (truncated value)

        // ? e. Modulus (%) : The modulus operator is used to find the remainder when the first operand is divided by the second operand.
        System.out.println(a % b);   // Output: 0

        // ? 2. Unary Arithmetic Operators : Unary arithmetic operators are used to perform operations on a single operand. The unary arithmetic operators in Java are:

        // ? a. Unary Plus (+) : The unary plus operator is used to indicate a positive value. It does not change the value of the operand.
        System.out.println(+a);   // Output: 10
        // ? b. Unary Minus (-) : The unary minus operator is used to indicate a negative value. It negates the value of the operand.
        System.out.println(-a);   // Output: -10    

        // & Increment and Decrement Operators : Increment and decrement operators are used to increase or decrease the value of a variable by 1. The increment operator is represented by "++" and the decrement operator is represented by "--". These operators can be used in two forms: prefix and postfix.        

        // & 1. Prefix Form : In the prefix form, the operator is placed before the variable. The variable is incremented or decremented before it is used in the expression.
        int x = 5;  
        System.out.println(++x);   // Output: 6 (x is incremented before being printed)

        // & 2. Postfix Form : In the postfix form, the operator is placed after the variable. The variable is incremented or decremented after it is used in the expression.
        int y = 5;
        System.out.println(y++);   // Output: 5 (y is printed before being incremented)
        System.out.println(y);     // Output: 6 (y is now incremented)

        

    }
    
}
