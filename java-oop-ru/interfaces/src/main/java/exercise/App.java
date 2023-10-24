package exercise;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

// BEGIN
class App {
    public static List<String> buildApartmentsList (List<Home> listOfHomes, int number) {
        List<String> newList = listOfHomes.stream()
                .sorted(Comparator.comparingDouble(Home::getArea))
                .map(Home::toString)
                .limit(number)
                .collect(Collectors.toList());

        return newList;
    }
}
// END
