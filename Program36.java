import java.util.Arrays;

public class Program36 {

  static void printArray(int[] numbers) {
    for (int i = 0; i < numbers.length; i++) {
      System.out.print(" " + numbers[i]);
    }
    System.out.println();
  }

  public static void main(String[] args) {
    int[] numbers = { -1, 12, -4, 18, 0, 2 };

    System.out.println("Before sorting: ");
    printArray(numbers);

    Arrays.sort(numbers);
    System.out.println("After sorting: ");
    printArray(numbers);

    System.out.println("Descending: ");
    for (int i = numbers.length - 1; i > -1; i--) {
      System.out.print(" " + numbers[i]);
    }
    System.out.println();
  }
}
