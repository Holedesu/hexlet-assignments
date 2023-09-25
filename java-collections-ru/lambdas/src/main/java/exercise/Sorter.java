package exercise;

import java.util.Comparator;
import java.util.Map;
import java.util.List;
import java.time.LocalDate;
import java.util.stream.Collectors;

// BEGIN
class Sorter {
    public static List<String> takeOldestMans(List<Map<String, String>>usersList) {
        return usersList.stream()
                .filter(userInfo -> userInfo.get("gender").equals("male"))
                .sorted(Comparator.comparing(userInfo -> LocalDate.parse(userInfo.get("birthday"))))
                .map(userInfo -> userInfo.get("name"))
                .collect(Collectors.toList());
    }
}

// END
