import java.util.Arrays;
import java.util.function.Function;

public class Main {
    static StringBuilder stringBuilder = new StringBuilder("American coconut");
    static Function<String, String> deleteEach = str -> {
        for (int i = 1; i < str.length(); i++) {
            if (Character.toLowerCase(str.charAt(i)) == Character.toLowerCase(str.charAt(0))) {
                str = new StringBuilder(str).deleteCharAt(i).toString();
            }
        }
        return str;
    };

    public static void deleter() {
        Arrays.stream(stringBuilder.toString().split("\s"))
                .map(deleteEach)
                .forEach(System.out::println);
    }

    public static void main(String[] args) {
        deleter();
    }
}
