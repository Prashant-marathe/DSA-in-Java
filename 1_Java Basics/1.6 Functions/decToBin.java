import java.util.*;

public class decToBin {
    public static void decToBinConvert(int decNum) {
        int pow = 0;
        int binNum = 0;
        int myNum = decNum;

        while(decNum > 0) {
            int remainder = decNum % 2;
            binNum = binNum + (remainder * (int)Math.pow(10, pow));

            pow++;
            decNum = decNum / 2;
        }
        System.out.println("Binary of " + myNum + " = " + binNum);
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        decToBinConvert(n);

        sc.close();
    }
}