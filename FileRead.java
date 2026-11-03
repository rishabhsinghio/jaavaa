import java.io.IOException;
import java.io.File;
import java.util.Scanner;

public class FileRead {
    public static void main(String[] args) throws IOException{
        File msdu = new File("msdu.txt");
        Scanner scanning = new Scanner(msdu);

        String read = scanning.nextLine();
        System.out.println(read);
    }
    
}