import java.util.Stack;

public class TraversingStack {
    public static void main(String[]args)
    {
        Stack<String> data = new Stack<String>() {};
        data.push("Apple");
        data.push("Orange");
        data.push("Banana");
        data.push("Cherry");
        System.out.print(data + ", ");
        System.out.println();
    }
}
