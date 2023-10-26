package exercise;

import java.util.Map;
import java.util.HashMap;

// BEGIN
class InMemoryKV implements KeyValueStorage{
    private Map<String, String> mapKV;

    public InMemoryKV(Map<String, String> mapKV) {
        this.mapKV = new HashMap<>();
        this.mapKV.putAll(mapKV);
    }

    public void set(String key, String value) {
        this.mapKV.put(key, value);
    }

    public void unset(String key) {
        this.mapKV.remove(key);
    }

    public String get(String key, String defaultOutput) {
        return this.mapKV.getOrDefault(key, defaultOutput);
    }

    public Map<String, String> toMap() {
        return new HashMap<>(this.mapKV);
    }
}
// END
