// 1. generate and print armstrong numbers from m-n 
// 2. count and print number of armstrong numbers
import java.util.Scanner;
public class Assignment15 {
   public static void main(String[] args) {
    try (Scanner input = new Scanner(System.in)) {
      System.out.print("start number: ");
      int m = input.nextInt();

      System.out.print("end number: ");
      int n = input.nextInt();
      
      int totalArmstrongNumber=0;

    
     System.out.println("Total armstrong numbers : "+totalArmstrongNumber);
    }
  }
}

