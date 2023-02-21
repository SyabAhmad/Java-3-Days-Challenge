public class TypeCasting {
    public static void main(String[] args)
    {
        /// Data Types in Java
        String value1 = "3";
        String value2 = "2";
        //// to convert String to int, for example
        int sum = Integer.parseInt(value1) + Integer.parseInt(value2);
        double sum1 = Double.parseDouble(value1) + Integer.parseInt(value2);
        float sum2 = Float.parseFloat(value1) + Integer.parseInt(value2);
        System.out.println("Sum (As expected sum is 6) = " + sum);
        /// to Convert back Int to String, Example
        System.out.println(String.valueOf(sum));
        System.out.println(String.valueOf(sum1));
        System.out.println(String.valueOf(sum2));
    }
}
