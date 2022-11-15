import java.util.Scanner;

public class Program30 {
   public static void main(String[] args) {
    try (Scanner input = new Scanner(System.in)) {
      System.out.print("Enter any postive integer: ");
      int number = input.nextInt();
      int temp = number;
      int sum = 0;
      while(temp!=0){
          int r = temp % 10;
          sum = sum + r*r*r;
          temp = temp / 10;
      }
     if(number == sum){
      System.out.println("Armstrong number");
     }
     else{
      System.out.println("Not a Armstrong number");
     }
    }
  }
}
