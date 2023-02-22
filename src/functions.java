import java.util.Scanner;

public class functions {

    public static void addition(int a, int b)
    {
        System.out.println(a+b);
    }
    public static void main(String[]args)
    {
        /// functions in Java
        System.out.println("Enter Values to sum them up: ");
        /// first we will create new instence of Scanner Class
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter First Number: ");
        int num1 = reader.nextInt();
        System.out.print("Enter second Number: ");
        int num2 = reader.nextInt();
        addition(num1, num2);
    }
}
