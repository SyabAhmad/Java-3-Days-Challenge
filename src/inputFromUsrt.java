import java.util.Scanner;

public class inputFromUsrt {
    public static void main(String[]args)
    {
        /// reading user
        ///Scanner is a class through we can take input from user
        Scanner reader=new Scanner(System.in);
        ////if we were taking input as String then,
        String userName = reader.nextLine();
        System.out.println(userName);

        System.out.println("Enter a number");
        int n=reader.nextInt(); /// we use .nextInt() for takin integer input
        System.out.println("Enter a number");
        int m=reader.nextInt();
        int sum=n+m;
        System.out.println("The sum is "+sum);


    }
}
