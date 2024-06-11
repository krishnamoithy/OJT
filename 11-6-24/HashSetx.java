import java.util.HashSet;
import java.util.Iterator;

public class HashSetx {  // Corrected class name to follow Java conventions
    public static void main(String[] args) {
        HashSet<String> s1 = new HashSet<>();
        s1.add("IBM");
        s1.add("ads");
        s1.add("adds");
        s1.add("IBMasas");
        s1.add("IasBMas");

        Iterator<String> itr = s1.iterator();  // Changed 'string' to 'String'
        while (itr.hasNext()) {
            System.out.println(itr.next());  // Corrected the print statement to print the elements
        }
    }
}
