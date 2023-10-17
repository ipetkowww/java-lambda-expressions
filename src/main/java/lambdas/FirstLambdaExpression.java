package lambdas;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class FirstLambdaExpression {

    public static void main(String[] args) {
        Supplier<String> supplier = () -> "Hello Lambda";
        String text = supplier.get();
        System.out.println(text);

        Consumer<String> consumer = (String s) -> System.out.printf("My name is %s%n", s);
        consumer.accept("Ivan");
    }
}
