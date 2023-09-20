package exercise;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

// BEGIN
class App {
    public static boolean scrabble(String symbols, String word) {
        List<String> chars = new ArrayList<>();

        if (symbols.length() <= word.length()) {
            return false;
        }

        for (String c : symbols.split("")) {
            chars.add(c.toLowerCase());
        }
        for (String a : word.toLowerCase().split("")) {
            if (chars.contains(a)) {
                chars.remove(a);
            }else if (!chars.contains(a)) {
                return false;
            }
        }
        return true;
    }
}
//END