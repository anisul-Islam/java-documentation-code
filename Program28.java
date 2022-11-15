import java.util.Scanner;

// SUM OF digits
// Reverse
// Palindrome
// Armstorng
public class Program28 {
  public static void main(String[] args) {
    try (Scanner input = new Scanner(System.in)) {
      System.out.print("Enter any postive integer: ");
      int number = input.nextInt();
      int temp = number;
      int sum = 0;
      while(temp!=0){
          int r = temp % 10;
          sum = sum *10 + r;
          temp = temp / 10;
      }
      System.out.println("Reverse : "+sum);
    }
  }
}
