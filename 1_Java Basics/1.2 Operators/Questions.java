public class Questions {
    public static void main(String[] args) {
        // * Question: What will be the output of following programs:

        // (i)
        // int x = 2, y = 5;
        // int exp1 = (x * y / x);     // Output: 5
        // int exp2 = (x * (y / x));   // Output: 4

        // System.out.println(exp1 + " , " + exp2);

        // (ii)
        // int x = 200, y = 50, z = 100;
        // if (x > y && y > z) {       // 200 > 50 && 50 > 100 -> False
        //     System.out.println("Hello");
        // }
        // if (x > y && z < x) {       // 200 > 50 && 100 < 200 -> True 
        //     System.out.println("Java");
        // }
        // if ((y + 200) < x && (y + 150) < z) {   // (50 + 200) < 200 && (50 + 150) < 100 -> False
        //     System.out.println("Hello Java");
        // }

        // (iii)
        // int x, y, z;
        // x = y = z = 2;
        // x += y;     // x = 4
        // y -= z;     // y = 0
        // z /= (x + y);   // z = 0
        // System.out.println(x + " " + y + " " + z);

        // (iv)
        // int x = 9, y = 12;
        // int a = 2, b = 4, c = 6;

        // int exp = 4/3 * (x + 34) + 9 * ( a + b * c) + (3 + y * (2 + a)) / (a + b * y);

        // System.out.println(exp);

        // (v)
        int x = 10, y = 5;
        int exp1 = (y * (x / y + x / y)); int exp2 = (y * x / y + y * x / y);
        System.out.println(exp1); System.out.println(exp2);
    }
    
}
