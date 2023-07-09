import java.util.Scanner;

class Program25 {
  public static void main(String args[]) {
    try (Scanner input = new Scanner(System.in)) {
      int m, n;
      int count = 0;
      int totalprime = 0;
      System.out.print("Enter initial number:");
      m = input.nextInt();
      System.out.print("Enter last number: ");
      n = input.nextInt();

      for (int i = m; i <= n; i++) {
        if (i < 2) {
          continue;
        } else {
          for (int j = 2; j < i; j++) {
            if (i % j == 0) {
              count++;
              break;
            }
          }
          if (count == 0) {
            System.out.println(i);
            totalprime++;
          }
          count = 0;
        }
      }
      System.out.println("total prime:" + totalprime);
    }
  }
}