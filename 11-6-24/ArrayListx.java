import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListx {  // Corrected class name to avoid conflicts and follow conventions
    public static void main(String[] args) {
        ArrayList<String> l1 = new ArrayList<>();  // Corrected the instantiation of ArrayList
        l1.add("HTML");
        l1.add("Java");  // Corrected capitalization
        l1.add("JSP");
        l1.add("Servlet");  // Corrected capitalization

        System.out.println("Element at index number 2: " + l1.get(2));
        for (String course : l1) {
            System.out.println(course);
        }
        System.out.println(l1);
        System.out.println("---------------");

        Iterator<String> itr = l1.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());  // Added print statement to display elements using Iterator
        }
    }
}
