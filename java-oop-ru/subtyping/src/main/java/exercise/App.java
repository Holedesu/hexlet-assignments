package exercise;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

// BEGIN
class App {
    public static KeyValueStorage swapKeyValue(KeyValueStorage data) {
        Map<String, String> map = data.toMap();
        Set<Entry<String, String>> entries = map.entrySet();
        for (Entry<String, String> entry : entries) {
            String key = entry.getKey();
            String value = entry.getValue();
            data.unset(key);
            data.set(value, key);
        }
        return data;
    }
}
// END
