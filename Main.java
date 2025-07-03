import java.util.List;

public class Main {

    public static void main(String[] args) {

      // Write few sample code for ai review test

      List<String> items = List.of("apple", "banana", "cherry");
      for (String item : items) {
          System.out.println("Item: " + item);
      }

      List<?> numbers = List.of(1, 2, 3, 4, 5);
      for (Object number : numbers) {
          System.out.println("Number: " + number);
      }
    }
}
