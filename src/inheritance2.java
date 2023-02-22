class student{
    public String studentName = "de Developer2";
    public int rollNumber = 12002;
    public void displayData ()
    {
        System.out.println(studentName);
        System.out.println(rollNumber);
    }
}
class newStudent extends student{
    public void changeUnfo()
    {
        student std1 = new student();
        std1.studentName = "de Developer3";
        std1.rollNumber = 12003;
        std1.displayData();
        student std2 = new student();
        std2.studentName = "de Developer4";
        std2.rollNumber = 12004;
        std2.displayData();
        student std3 = new student();
        std3.studentName = "de Developer5";
        std3.rollNumber = 12005;
        std3.displayData();
        student std4 = new student();
        std4.studentName = "de Developer6";
        std4.rollNumber = 12006;
        std4.displayData();
        student std5 = new student();
        std5.studentName = "de Developer7";
        std5.rollNumber = 12007;
        std5.displayData();
    }

}
public class inheritance2 extends newStudent{
    public static void main(String[]args)
    {
        newStudent student1 = new newStudent();
        student1.changeUnfo();
    }
}
