class car{
    public String carName;
    public void carHonk(){
        System.out.println("peeeeeeeeeeeeeeeeeeeeeeeeeeeep");
    }
}
public class inheritance extends  car{
    public static void main(String []args){
        inheritance Inheritance = new inheritance();
        Inheritance.carName = " Toyota";
        Inheritance.carHonk();
        System.out.println(Inheritance.carName);
        //// if int type (method)
        ///System.out.println(Inheritance.carHonk());
    }
}
