import java.util.Scanner;

public class Program37 {
  public static void main(String[] args) {
    try (Scanner input = new Scanner(System.in)) {
      String text = input.nextLine();
      char[] arr = text.toCharArray();

      for (int x = arr.length - 1; x > -1; x--) {
        System.out.print(arr[x]);
      }
    }
  }
}
