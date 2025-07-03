import java.util.List;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

      // Write few sample code for ai review test

      List<String> items = List.of("tv", "laptop", "phone", "tablet");
      for (String item : items) {
          System.out.println("Item: " + item);
      }

      List<?> numbers = List.of("one", "two", "three", 4, 5.0, 6L);
      for (Object number : numbers) {
          System.out.println("Number: " + number);
      }

      Stream<String> stream = Stream.of("apple", "banana", "cherry");
      stream.forEach(fruit -> System.out.println("Fruit: " + fruit));
      System.out.println(stream.count() + " fruits processed.");
    }
}
