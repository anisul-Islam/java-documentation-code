import java.util.Scanner;

// vowel or consonant program 
public class Program13 {
  public static void main(String[] args) {
    try (Scanner input = new Scanner(System.in)) {
      System.out.print("Enter a letter: ");
      char ch = input.next().charAt(0);

      if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
        System.out.println("Vowel");
      }else{
         System.out.println("Consonant");
      }

    }
    
  }
}
