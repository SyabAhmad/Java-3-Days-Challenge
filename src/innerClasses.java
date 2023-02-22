class outerClass{
    String userName = "i am outer Developer";
    class InnerClass{
        String userName = "i am inner Developer";
    }
}
public class innerClasses {
    public static void main(String []args){
        outerClass outer = new outerClass();
        outerClass.InnerClass inner = outer.new InnerClass();
        System.out.println(outer.userName);
        System.out.println(inner.userName);
    }
}