abstract class animal1{
    public abstract void name();
    public void sound(){

        System.out.println("mew ew mew emw");
    }
}
class cat extends animal1{
    @Override
    public void name() {
        System.out.print("name of the animal is cat which says : ");
    }
}
public class abstraction {
    public static void main(String[] args){
        cat animal1 = new cat();
        animal1.name();
        animal1.sound();
    }
}
