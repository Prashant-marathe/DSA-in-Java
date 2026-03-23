import java.util.Scanner;
public class Questions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // & Question 1: Write a java program to get a number from the user and print whether it is positive or negetive.
        // int num = sc.nextInt();
        // if (num >= 0) {
        //     System.out.println("Positive");
        // }else{
        //     System.out.println("Negetive");
        // }

        // & Question 2: Finish the following code so that it prints You have a fever if your temperature is above 100 and otherwise print You don't have a fever.
        double temp = 103.5;
        if (temp >= 100) {
            System.out.println("You have a fever");
        }else{
            System.out.println("You don't have a fever");
        }

        // & Question 3 : Write a Java program to input week number(1-7) and print day of week name using switch case.
        // int day = sc.nextInt();
        // switch(day){
        //     case 1:
        //         System.out.println("Monday");
        //         break;
        //     case 2:
        //         System.out.println("Tuesday");
        //         break;
        //     case 3:
        //         System.out.println("Wednesday");
        //         break;
        //     case 4:
        //         System.out.println("Thursday");
        //         break;
        //     case 5:
        //         System.out.println("Friday");
        //         break;
        //     case 6:
        //         System.out.println("Saturday");
        //         break;
        //     case 7:
        //         System.out.println("Sunday");
        //         break;
        //     default:
        //         System.out.println("Please enter a valid number that correspondence to a day in the week");
        //         break;
        // }

        // & Question 4 : What will be the value of x & y in the following
        // int a = 63, b = 36;
        // boolean x = (a > b) ? true : false; // ? x = true/1
        // int y = (a > b) ? a : b;    //? y = 63
        // System.out.println(x);
        // System.out.println(y);

        // & Question 5: Write a Java Program that takes a year from the user and prints whether that year is leap or not
        System.out.print("Input the year: "); int year = sc.nextInt();
        boolean x = (year % 4) == 0; 
        boolean y = (year % 100) != 0;
        boolean z = ((year % 100 == 0) && (year % 400 == 0));
        if (x && (y || z)) {
        System.out.println(year + " is a leap year");
        } else {
        System.out.println(year + " is not a leap year");
        }
        
        sc.close();
    }
    
}
