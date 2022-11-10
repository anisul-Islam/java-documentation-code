import java.util.Scanner;

// Area of Triangle
public class Program9 {
  public static void main(String[] args) {
    double base, height, area;

    Scanner input = new Scanner(System.in);

    System.out.print("Enter Base = ");
    base = input.nextInt();

    System.out.print("Enter Height = ");
    height = input.nextInt();

    area = 0.5 * base * height;

    System.out.println("Area of Triangle = "+area);
  }
}
