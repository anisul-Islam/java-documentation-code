import java.util.Scanner;

//prime number or not
public class Program24 {
  public static void main(String[] args) {
    try (Scanner input = new Scanner(System.in)) {
      System.out.print("Enter a positive integer: ");
      int number = input.nextInt();
      int count=0;

      if(number==0 || number ==1){
        System.out.println("Not Prime number");
      }else{
         for(int i=2; i< number ; i++){
            if(number%i == 0){
              count++;
              break;
            }
          }
          if(count==0){
            System.out.println("Prime number");
          }else{
             System.out.println("Not Prime number");
          }
       
      }
    }
  } 
}
