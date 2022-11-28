import java.util.Scanner;
// 2 3 5 7 11 13 17 19 23 ....

class Prime{
  public static void main(String[] args) {
    try (Scanner input = new Scanner(System.in)) {

      System.out.print("Enter any positive integer: ");
      int num = input.nextInt();
      int count = 0;

      if(num == 0 || num==1){
        System.out.println("Not Prime");
      }else{
        for(int i=2; i<num/2; i++){ 
          if(num%i==0){
            count++;
            break;
          }
        }
        if(count==0){
          System.out.println("Prime number");
        }else{
          System.out.println("Not Prime");
        }
      }     
    }
  }
}
