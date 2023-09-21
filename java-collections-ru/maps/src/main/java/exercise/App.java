package exercise;

import java.util.HashMap;
import java.util.Map;

// BEGIN
class App {
    public static Map<String, Integer> getWordCount(String sentence) {
        if(sentence.isEmpty()) {
            return new HashMap<>();
        }
        String[] words = sentence.split(" ");
        Map<String, Integer> result = new HashMap<>();
        for (String word : words) {
            if (result.containsKey(word)) {
                result.put(word, result.get(word) + 1);
            } else {
                result.put(word, 1);
            }
        }
        return result;
    }

    public static String toString(Map<String, Integer> wordsCount) {
        StringBuilder mapAsString = new StringBuilder("{");
        if (wordsCount.size() == 0) {
            mapAsString.append("}");
            return mapAsString.toString();
        }
        mapAsString.append("\n");
        for(String key : wordsCount.keySet()) {
            mapAsString.append("  " + key + ": " + wordsCount.get(key) + "\n");
        }
        mapAsString.append("}");
        return mapAsString.toString();
    }
}
//END
