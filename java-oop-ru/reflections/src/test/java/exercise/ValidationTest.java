package exercise;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

import java.util.HashMap;
import java.util.List;
import java.util.Map;



class ValidationTest {

    @Test
    void testValidate() {
        Address address1 = new Address("Russia", "Ufa", "Lenina", "54", null);
        List<String> result1 = Validator.validate(address1);
        List<String> expected1 = List.of();
        assertThat(result1).isEqualTo(expected1);

        Address address2 = new Address(null, "London", "1-st street", "5", "1");
        List<String> result2 = Validator.validate(address2);
        List<String> expected2 = List.of("country");
        assertThat(result2).isEqualTo(expected2);

        Address address3 = new Address("USA", null, null, null, "1");
        List<String> result3 = Validator.validate(address3);
        List<String> expected3 = List.of("city", "street", "houseNumber");
        assertThat(result3).isEqualTo(expected3);
    }

    // BEGIN
    @Test
    void testAdvancedValidate() {
        Address address1 = new Address("USA", "Texas", null, "7", "2");
        Map<String, String> result1 = Validator.advancedValidate(address1);
        Map<String, String> actual = new HashMap<>();
        actual.put("country", "[length less than 4]");
        actual.put("street", "[can not be null]");
        assertThat(result1).isEqualTo(actual);

        Address address2 = new Address(null, "Texas", null, "7", "2");
        Map<String, String> result2 = Validator.advancedValidate(address2);
        Map<String, String> actual2 = new HashMap<>();
        actual2.put("country", "[can not be null]");
        actual2.put("street", "[can not be null]");
        assertThat(result2).isEqualTo(actual2);

        Address address3 = new Address("China", "Texas", null, "7", "2");
        Map<String, String> result3 = Validator.advancedValidate(address3);
        Map<String, String> actual3 = new HashMap<>();
        actual3.put("street", "[can not be null]");
        assertThat(result3).isEqualTo(actual3);

        Address address4 = new Address("Peru", "Texas", null, "7", "2");
        Map<String, String> result4 = Validator.advancedValidate(address4);
        Map<String, String> actual4 = new HashMap<>();
        actual4.put("street", "[can not be null]");
        assertThat(result4).isEqualTo(actual4);
    }
    // END
}
