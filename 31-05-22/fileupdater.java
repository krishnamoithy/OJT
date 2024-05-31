
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class fileupdater {
    public static void main(String[] args) {
        String file = "krishna.txt";
        String newline = "this line is added .";
        try {
            updatefile(file ,newline);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void  updatefile(String file, String newline) throws IOException {
        try(BufferedWriter Writer = new BufferedWriter(new FileWriter(file, true))){
            Writer.newLine();
            Writer.write(newline);
        }
    }
}
