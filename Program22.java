import java.util.Scanner;

// factorial of a number
public class Program22 {
  public static void main(String[] args) {
    try (Scanner input = new Scanner(System.in)) {
      System.out.print("Find factorial of : ");
      int number = input.nextInt();
      int fact = 1;
      for(int i=number; i>=1 ; i--){
        fact = fact * i;
      }
      System.out.println(fact);
    
    }
    
  }
}
