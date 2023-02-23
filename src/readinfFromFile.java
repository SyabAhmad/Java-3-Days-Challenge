import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class readinfFromFile {
    public static void main(String[]args) throws FileNotFoundException {
        File myFile = new File("data.txt");
        Scanner reader = new Scanner(myFile);
        while (reader.hasNextLine())
        {
            String data = reader.nextLine();
            System.out.println(data);
        }
    }
}
