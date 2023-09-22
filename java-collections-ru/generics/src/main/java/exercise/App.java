package exercise;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

// BEGIN
public class App {
    public static List<Map<String, String>> findWhere(List<Map<String, String>> books, Map<String, String> where) {
        List<Map<String, String>> result = new ArrayList<>();
        for (Map<String, String> book : books) {
            if (where.entrySet().stream().allMatch(e -> book.get(e.getKey()).equals(e.getValue()))) {
                result.add(book);
            }
        }
        return result;
    }
}
//END
