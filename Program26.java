import java.util.Scanner;

public class Program26 {
  public static void main(String[] args) {
    try (Scanner input = new Scanner(System.in)) {

      System.out.print("How many fibonacci numbers? ");
      int n = input.nextInt();

      int first = 0;
      int second = 1;

      for(int i=1; i<=n; i++){
        if(i<=2){
          System.out.print(" "+ (i-1));
        }else{
          int fibo =  first + second;
          System.out.print(" "+fibo);
          first = second;
          second = fibo;
        }
      }

    }
  }
}
