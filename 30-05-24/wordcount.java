import java.util.Scanner;

public class wordcount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter a line of text:");
        String line = scanner.nextLine();
        
        
        String[] words = line.trim().split("\\s+");
        
        
        
        int wordCount = words.length;
        
        
        
        if (line.trim().isEmpty()) {
            wordCount = 0;
        }
        
        System.out.println("The number of words in the line is: " + wordCount);
        
        scanner.close();
    }
}
