import java.io.File;
import java.io.IOException;

public class FileCt {
    public static void main(String[] args) throws IOException{
        File f1 = new File("textfile.txt");
        f1.createNewFile();
    }
}
