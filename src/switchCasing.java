public class switchCasing {
    public static void main(String[]args)
    {
        int value1 = 10;
        int value2 = 12;
        char operator = '+';
        switch (operator)
        {
            case '+':
                System.out.println(value1 +value2);
                break;
            case '-':
                System.out.println(value1-value2);
                break;
            case '*':
                System.out.println(value1*value2);
                break;
            case '/':
                System.out.println(value1/value2);
                break;
            default:
                System.out.println("Invalid Arguments");
                break;

        }
    }
}
