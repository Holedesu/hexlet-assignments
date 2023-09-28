package exercise;

import java.util.*;

// BEGIN
class App {
//    public static Map<String, String> genDiff(Map<String, Object> data1, Map<String, Object> data2) {
//        Map<String, String> result = new HashMap();
//        for(String key: data1.keySet()) {
//            if(data2.containsKey(key)) {
//                if(data2.containsValue(key) == data1.containsValue(key)) {
//                    result.put(key, "unchanged");
//                } else {
//                    result.put(key, "changed");
//                }
//            } else {
//                result.put(key, "deleted");
//            }
//        }
//        for(String key: data2.keySet()) {
//            if(!data1.containsKey(key)) {
//                result.put(key, "added");
//            }
//        }
//        return result;
//    }

    public static Map<String, String> genDiff(Map<String, Object> data1, Map<String, Object> data2) {
        Map<String, String> result = new LinkedHashMap<>();

        for (String key : data1.keySet()) {
            if (!data2.containsKey(key)) {
                result.put(key, "deleted");
            } else if (!Objects.equals(data1.get(key), data2.get(key))) {
                result.put(key, "changed");
            } else {
                result.put(key, "unchanged");
            }
        }

        for (String key : data2.keySet()) {
            if (!data1.containsKey(key)) {
                result.put(key, "added");
            }
        }

        return result;
    }
}


//END
