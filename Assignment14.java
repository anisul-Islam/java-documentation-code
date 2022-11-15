// 1. generate and print palindrome numbers from m-n 
// 2. count and print number of palindrome numbers
import java.util.Scanner;
public class Assignment14 {
   public static void main(String[] args) {
    try (Scanner input = new Scanner(System.in)) {
      System.out.print("start number: ");
      int m = input.nextInt();

      System.out.print("end number: ");
      int n = input.nextInt();
      
      int totalPalindromeNumber=0;

    
     System.out.println("Total Palindrome numbers : "+totalPalindromeNumber);
    }
  }
}
