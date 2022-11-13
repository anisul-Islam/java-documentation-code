// sum of the all the even numbers from m-n
import java.util.Scanner;

public class Program21 {
  public static void main(String[] args) {
    try (Scanner input = new Scanner(System.in)) {
      System.out.print("m = ");
      int m = input.nextInt();
      System.out.print("n = ");
      int n = input.nextInt();
      int sum = 0;
      for(int x=m; x<=n; x++){
        if(x%2 == 0){
          sum = sum + x;
        }
      }
       System.out.println(sum);
    }
   
  }
}
