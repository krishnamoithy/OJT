
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class fileHanler {
    public static void main(String[] args) {
        String file = "krishna.txt";
        readFile(file);
    }

    public static void readFile(String file) {
        try(BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        }catch (IOException e) {
            e.printStackTrace();
        }
    }

}