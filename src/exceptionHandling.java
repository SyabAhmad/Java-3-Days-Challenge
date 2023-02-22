import java.util.Scanner;
public class exceptionHandling {
    public static void main(String []args){
        Scanner reader = new Scanner(System.in);
        double number1;
        double number2;
        double result;
        System.out.println("Enter First Number: ");
        number1 = reader.nextDouble();
        System.out.println("Enter Second Number: ");
        number2 = reader.nextDouble();
        try {
            result = number1/number2;
            System.out.println(result);
        } catch (ArithmeticException e){
            e.printStackTrace();
        }
        finally {
            System.out.println("Can not / By Zero");
        }
    }
}
