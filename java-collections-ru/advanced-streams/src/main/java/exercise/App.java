package exercise;

import java.sql.Array;
import java.util.stream.Collectors;
import java.util.Arrays;

// BEGIN
class App {
    public static String getForwardedVariables(String content) {
        return Arrays.stream(content.split("\n"))
                .filter(line -> line.startsWith("environment="))
                .flatMap(line -> Arrays.stream(line.substring(13).split(",")))
                .filter(variable -> variable.startsWith("X_FORWARDED"))
                .map(variable -> variable.substring(12))
                .map(variable -> variable.replace("\"", ""))
                .collect(Collectors.joining(","));
    }

//    public static void main(String[] args) {
//        String content = Files.readString("s.conf");
//        String result = App.getForwardedVariables(content);
//        System.out.println(result);
//    }
}
//END
