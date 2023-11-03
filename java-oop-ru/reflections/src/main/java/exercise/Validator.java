package exercise;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// BEGIN
class Validator {

    public static List<String> validate(Object address) {
        List<String> notValidFields = new ArrayList<>();

        Field[] fields = address.getClass().getDeclaredFields();
        for (Field field : fields) {
            if (field.isAnnotationPresent(NotNull.class)) {
                field.setAccessible(true);
                try {
                    Object value = field.get(address);
                    if (value == null) {
                        notValidFields.add(field.getName());
                    }
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }

        return notValidFields;
    }

    public static Map<String, String> advancedValidate (Object address) {
        Map<String, String> errorMessage = new HashMap<>();
        Field[] fields = address.getClass().getDeclaredFields();
        for (Field field : fields) {
            if (field.isAnnotationPresent(NotNull.class)) {
                field.setAccessible(true);
                try {
                    Object value = field.get(address);
                    if (value == null) {
                        errorMessage.put(field.getName(), "[can not be null]");
                    } else if (field.getName().equals("country") && value.toString().length() < 4) {
                        errorMessage.put(field.getName(), "[length less than 4]");
                    }
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }

        return errorMessage;
    }
}
// END
