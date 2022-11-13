import java.util.Scanner;

//multiplication table
public class Program23 {
  public static void main(String[] args) {
    try (Scanner input = new Scanner(System.in)) {
      System.out.print("start number: ");
      int m = input.nextInt();
      System.out.print("end number: ");
      int n = input.nextInt();
      int fact = 1;
      System.out.println("----------------");
      for(int i=m; i<=n ; i++){
        for(int j=1; j<=10 ; j++){
          System.out.println(i +" X "+j + " = "+i*j);
        }
        System.out.println("----------------");
      }
      System.out.println(fact);
    
    }
    
  }
}
