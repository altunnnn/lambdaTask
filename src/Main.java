import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;


public class Main {
    public static void main(String[] args) {
        List<String> name = Arrays.asList("Mehemmed", "Eli", "Akr");
        List result = name.stream().filter(s -> s.startsWith("E")).collect(Collectors.toList());
        System.out.println(result);


        DoubleStream doubleStream = DoubleStream.of(0.7, 8.2, 0.1, 6.2);
        doubleStream.mapToInt(v -> (int) v).forEach(System.out::println);
    }
}
