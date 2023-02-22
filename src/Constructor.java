public class Constructor {
    String userName;
    public Constructor(String y){
        //this.userName="Developer";
        this.userName=y;
    }
    public static void main(String[] args){
        Constructor constructor = new Constructor("Developer");
        System.out.println(constructor.userName);
    }
}
