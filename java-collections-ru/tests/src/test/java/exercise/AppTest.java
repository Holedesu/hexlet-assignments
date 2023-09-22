package exercise;

import static org.assertj.core.api.Assertions.assertThat;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;

class AppTest {

    @Test
    void testTake() {
        // BEGIN
        List<Integer> numbers1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        List<Integer> numbers2 = new ArrayList<>();
        List<Integer> numbers3 = new ArrayList<>(Arrays.asList(7, 3, 10, 1, 12, 5, 2, 56, 8, 123, 4));

        assertThat(App.take(numbers1, 2)).containsExactly(1, 2);
        assertThat(App.take(numbers1, 4)).containsExactly(1, 2, 3, 4);
        assertThat(App.take(numbers1, 10)).containsExactly(1, 2, 3, 4);
        assertThat(App.take(numbers1, 0)).isEmpty();

        assertThat(App.take(numbers2, 0)).isEmpty();

        assertThat(App.take(numbers3, 8)).containsExactly(7, 3, 10, 1, 12, 5, 2, 56);
        // END
    }
}
