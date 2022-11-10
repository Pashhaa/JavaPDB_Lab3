import java.util.Arrays;
import java.util.function.Function;

public class Main {
    static StringBuilder stringBuilder = new StringBuilder("coconut America");
    static Function<String, String> deleteEach = str -> {
        char first = Character.toLowerCase(str.charAt(0));
        for (int i = 0; i < str.length(); i++) {
            if (Character.toLowerCase(str.charAt(i)) == first) {
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
