import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

public class Test {
  public static void main(String[] args) {
    ArrayList<String> fruits = new ArrayList<>();

    // Add elements to the ArrayList
    fruits.add("Apple");
    fruits.add("Banana");
    fruits.add("Orange");
    fruits.add(3, "Mango");

    // remove elements from the ArrayList
    fruits.remove(3);
    System.out.println("After removing:  " + fruits);
    // fruits.removeAll();
    // fruits.clear();

    // set elements
    fruits.set(2, "Mango");
    System.out.println("After setting new item:  " + fruits);

    // Access elements
    System.out.println("First fruit: " + fruits.get(0));

    // Iterate over elements
    for (String fruit : fruits) {
      System.out.println(fruit);
    }

    // Size of the ArrayList
    System.out.println("Size: " + fruits.size());

    // Check the ArrayList is empty or not
    System.out.println("isEmpty: " + fruits.isEmpty());

    // Check the ArrayList contains an item or not
    System.out.println("contains Mango: " + fruits.contains("Mango"));

    // Check the index of an item
    System.out.println("index of Mango: " + fruits.indexOf("Mango"));

    // print ArrayList using iterator
    Iterator itr = fruits.iterator();
    while (itr.hasNext()) {
      System.out.println(itr.next());
    }

    ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
    System.out.println(numbers);

    Collections.sort(numbers);
    System.out.println("After sorting in Ascending order: " + numbers);

    Collections.reverse(numbers);
    System.out.println("After sorting in Descending order: " + numbers);
  }
}
