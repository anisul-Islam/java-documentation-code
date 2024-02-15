// for each or enhanched for loop
import java.util.Scanner;

public class Program33 {
  public static void main(String[] args) {

       try (Scanner input = new Scanner(System.in)) {
        
        String[] countries = {"Bangladesh", "Pakistan", "England", "Palestine","Gaza","Afghanistan"};

        for (String country : countries) {
          System.out.println(country);
        }
         
      }
  }
}
