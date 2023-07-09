public class Program34 {
  public static void main(String[] args) {
    int [][] numbers = new int[3][3]; // 3 rows x 3 columns = 9 items

    // first row
    numbers[0][0] = 1;
    numbers[0][1] = 2;
    numbers[0][2] = 3;

    // second row
    numbers[1][0] = 4;
    numbers[1][1] = 5;
    numbers[1][2] = 6;

    // third row
    numbers[2][0] = 7;
    numbers[2][1] = 8;
    numbers[2][2] = 9;

    // printing 2d array
    for(int row=0; row<numbers.length; row++){
      for(int col=0; col<numbers[row].length; col++){
        System.out.print(numbers[row][col]);
      }
      System.out.println();
    }
  }
}
