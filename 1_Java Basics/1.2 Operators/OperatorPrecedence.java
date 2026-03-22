public class OperatorPrecedence {
    public static void main(String[] args) {
        // & Operator Precedence in Java : Operator precedence refers to the rules that determine the order in which operators are evaluated in an expression. It is important to understand operator precedence to ensure that expressions are evaluated correctly and produce the expected results.

        // ? List of Operator Precedence in Java (from highest to lowest):
        // ? 1. Parentheses ()
        // ? 2. Unary Operators (++, --, +, -)
        // ? 3. Multiplicative Operators (*, /, %)
        // ? 4. Additive Operators (+, -)
        // ? 5. Relational Operators (<, >, <=, >=)
        // ? 6. Equality Operators (==, !=)
        // ? 7. Logical AND (&&)
        // ? 8. Logical OR (||)

        int a = 10 + 5 * 2;   // Multiplication has higher precedence than addition
        System.out.println(a);   // Output: 20

        int b = (10 + 5) * 2;   // Parentheses have the highest precedence
        System.out.println(b);   // Output: 30

        int c = 10 - 5 + 2;     // Addition and subtraction have the same precedence, evaluated left to right
        System.out.println(c);   // Output: 7

        int d = 10 / 2 * 3;     // Division and multiplication have the same precedence, evaluated left to right
        System.out.println(d);   // Output: 15


        // & Associativity of Operators : When two operators have the same precedence, their associativity determines the order of evaluation. In Java, most operators are left-associative, meaning they are evaluated from left to right. However, some operators, such as assignment operators and unary operators, are right-associative, meaning they are evaluated from right to left.
    }
    
}
