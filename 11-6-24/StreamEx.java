import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamEx {
    public static void main(String[] args) {
        // Filtering
        List<String> names = Arrays.asList("Summer", "Autumn", "Spring", "Winter");

        List<String> filteredNames = names.stream()
                                          .filter(name -> name.startsWith("S"))
                                          .collect(Collectors.toList());

        System.out.println("Filtered names are: " + filteredNames);
        
        // Sorting
        List<String> sortedNames = names.stream()
                                        .sorted()
                                        .collect(Collectors.toList());
        System.out.println("Sorted names: " + sortedNames);

        // Mapping
        Map<Integer, List<String>> mobj = names.stream()
                                               .collect(Collectors.groupingBy(String::length));
        System.out.println("Mapping values: " + mobj);
    }
}
