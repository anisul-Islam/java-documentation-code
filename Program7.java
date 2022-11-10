import java.util.Scanner;

public class Program7 {
  public static void main(String[] args) {
    int number1, number2, result;
    Scanner input = new Scanner(System.in);

    System.out.print("number1 = ");
    number1 = input.nextInt();
    System.out.print("number2 = ");
    number2 = input.nextInt();

    result = number1 + number2;
    System.out.println(number1 +" + "+number2 + " = "+result);

    result = number1 - number2;
    System.out.println(number1 +" - "+number2 + " = "+result);

    result = number1 * number2;
    System.out.println(number1 +" * "+number2 + " = "+result);

    // type casting
    double result2 = (double)number1 / number2;
    System.out.println(number1 +" / "+number2 + " = "+result2);

    result = number1 % number2;
    System.out.println(number1 +" % "+number2 + " = "+result);

  }
}
