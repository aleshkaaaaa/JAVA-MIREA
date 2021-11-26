import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        Map<String, String> names = Map.of(
                "David", "Adams",
                "Harry", "Adams",
                "James", "Barker",
                "Robert", "Bell",
                "Michael", "Bell",
                "William", "Bell",
                "Charles", "Johnson",
                "Daniel", "Johnson",
                "Oscar", "Murray",
                "Joe", "Parker"
        );

        System.out.printf("Before: %s%n", names);

        Set<String> lastNames = new HashSet<>();
        names = names.entrySet()
                .stream()
                .filter(entry -> lastNames.add(entry.getValue()))
                .collect(Collectors.toMap(Map.Entry::getValue, Map.Entry::getKey));

        System.out.printf("After: %s%n", names);
    }

}