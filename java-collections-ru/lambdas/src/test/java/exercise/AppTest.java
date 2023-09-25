package exercise;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

// BEGIN
class AppTest {
    @Test
    void testWithoutArray() {
        String[][] expected = {
                {},{}
        };

        String[][] example = {{}};
        String[][] actual = App.enlargeArrayImage(example);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void testWithArray() {
        String[][] expected = {
                {"*", "*", "*", "*", "*", "*", "*", "*"},
                {"*", "*", "*", "*", "*", "*", "*", "*"},
                {"*", "*",  " " ," ", " " , " ", "*", "*"},
                {"*", "*",  " " ," ", " " , " ", "*", "*"},
                {"*", "*",  " " ," ", " " , " ", "*", "*"},
                {"*", "*",  " " ," ", " " , " ", "*", "*"},
                {"*", "*", "*", "*", "*", "*", "*", "*"},
                {"*", "*", "*", "*", "*", "*", "*", "*"}
        };

        String[][] example = {
                {"*", "*", "*", "*"},
                {"*", " ", " ", "*"},
                {"*", " ", " ", "*"},
                {"*", "*", "*", "*"},
        };
        String[][] actual = App.enlargeArrayImage(example);

        assertThat(actual).isEqualTo(expected);
    }
}
// END
