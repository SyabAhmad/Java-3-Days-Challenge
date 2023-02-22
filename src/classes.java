class animal{
    String name;
    void Eating(){
        System.out.println(name + " is eating");
    }
}
public class classes {
    public static void main(String[]args)
    {
        //// classes
        animal a = new animal();
        a.name = "cat";
        a.Eating();
    }
}
