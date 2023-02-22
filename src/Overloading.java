public class Overloading {
    static int sum(int x, int y){
        return x+y;
    }
    static double sum(double x, double y){
        return x+y;
    }
    public static void main(String []args){
        System.out.println(sum(2,6));
        System.out.println(sum(3.2, 4.2));
    }
}
