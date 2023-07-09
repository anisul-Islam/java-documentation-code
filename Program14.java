
// small /capital letter
import java.util.Scanner;

public class Program14 {
  public static void main(String[] args) {
    try (Scanner input = new Scanner(System.in)) {
      System.out.print("Enter a letter: ");
      char ch = input.next().charAt(0);

      if (ch >= 'a' && ch <= 'z') {
        System.out.println("Small letter");
      } else if (ch >= 'A' && ch <= 'Z') {
        System.out.println("Capital letter");
      } else {
        System.out.println("Not a letter");
      }

    }

  }
}
