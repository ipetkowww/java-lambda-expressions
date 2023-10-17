package lambdas;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class MoreLambdas {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>(List.of("One", "Two", "Three", "Four", "Five"));

        Predicate<String> filter = (String s) -> s.startsWith("T");
        Consumer<String> result = (String s) -> System.out.printf("%s%n", s);
        list.removeIf(filter);
        list.forEach(result);
        System.out.println("==============================================");

        list.removeIf(s -> s.startsWith("T"));
        list.forEach(System.out::println);
    }
}
