import java.util.Scanner;

// Matrix Program 
// A + B = ?
public class Program35 {

  static void printMatrix(int[][] number) {
    for (int row = 0; row < number.length; row++) {
      for (int column = 0; column < number[row].length; column++) {
        System.out.print(" " + number[row][column]);
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
    int[][] A = new int[2][3];
    int[][] B = new int[2][3];
    int[][] C = new int[2][3];

    try (Scanner input = new Scanner(System.in)) {

      System.out.println("Input for A Matrix");
      for (int row = 0; row < A.length; row++) {
        for (int column = 0; column < A[row].length; column++) {
          System.out.printf("A[%d][%d] = ", row, column);
          A[row][column] = input.nextInt();
        }
      }

      System.out.println("Printing A Matrix");
      printMatrix(A);

      System.out.println("Input for B Matrix");
      for (int row = 0; row < B.length; row++) {
        for (int column = 0; column < B[row].length; column++) {
          System.out.printf("B[%d][%d] = ", row, column);
          B[row][column] = input.nextInt();
        }
      }

      System.out.println("Printing B Matrix");
      printMatrix(B);

      // calculating C=A+B
      for (int row = 0; row < B.length; row++) {
        for (int column = 0; column < B[row].length; column++) {
          C[row][column] = A[row][column] + B[row][column];
        }
      }

      System.out.println("Printing C Matrix");
      printMatrix(C);
    }

  }
}
