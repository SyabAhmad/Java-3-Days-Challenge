import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class writingToAFile {
    public static void main(String[]args) throws IOException {
        File myFile = new File("data.txt");
        FileWriter write = new FileWriter(myFile);
        //FileWriter will write given text to file called data.txt
        write.write("de Developer");
    }
}
