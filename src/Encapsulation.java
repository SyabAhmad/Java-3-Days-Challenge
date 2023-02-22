public class Encapsulation {
    private String userName;

    public String getUserName(){
        return userName;
    }
    public void setUserName(String newName){
        this.userName= newName;
    }
    public static void main(String[]args){
        Encapsulation encapsulation = new Encapsulation();
        encapsulation.setUserName("Developer");
        encapsulation.getUserName();
        System.out.println(encapsulation.getUserName());
    }
}
