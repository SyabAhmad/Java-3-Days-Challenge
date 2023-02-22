import java.sql.PreparedStatement;
import java.util.Scanner;

public class simpleAuthUsingFunctions {

    public static boolean validation(String name, String pin)
    {
        boolean result = false;
        if(name.equals("de Developer") && pin.equals("1234"))
        {
             result = true;
        }else {
            result = false;
        }
        return result;
    }

    public static void main(String[]args)
    {
        //// simple authentication using Functions
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter INformation Below");
        System.out.print("User Name: ");
        String userName = reader.nextLine();
        System.out.print("Pin Code: ");
        String pinCOde = reader.next();
        validation(userName, pinCOde);
        if (validation(userName, pinCOde) == true)
        {
            System.out.println("Welcome");
        }else {
            System.out.println("Invalid arguments");
        }
    }
}
