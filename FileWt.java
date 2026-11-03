import java.io.FileWriter;
import java.io.IOException;

public class FileWt {
    public static void main(String[] args) throws IOException{
        FileWriter filewrite = new FileWriter("gyaan.txt");
        filewrite.write("Padh lo chahe kahi se selection hoga yahi se");
        filewrite.close();
    }
    
}