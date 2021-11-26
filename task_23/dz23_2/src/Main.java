import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        List<City> cities = List.of(
                new City("New York", "USA"),
                new City("Washington", "USA"),
                new City("Prague", "Czech"),
                new City("Ostrava", "Czech"),
                new City("Warsaw", "Poland"),
                new City("Kraków", "Poland"),
                new City("Riga", "Latvia")
        );

        Map<String, ArrayList<String>> citiesMap = new HashMap<>();
        for (City city : cities) {
            if (!citiesMap.containsKey(city.getCountry())) {
                citiesMap.put(city.getCountry(), new ArrayList<>());
            }
            citiesMap.get(city.getCountry()).add(city.getName());
        }

        citiesMap.forEach((key, value) -> System.out.println(key + ": " + value));
    }

}