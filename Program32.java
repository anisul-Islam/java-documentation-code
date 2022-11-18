public class Program32 {
  public static void main(String[] args) {
    int[] numbers; // array declaration
    numbers = new int[5]; //array creation

    numbers[0] = 10;
    numbers[1] = 20;
    numbers[2] = 30;
    numbers[3] = 40;
    numbers[4] = 50;

    int sum=0;
    for(int x=0; x<numbers.length;x++){
      sum+=numbers[x];
    }

    int max=numbers[0];
    int min=numbers[0];
    for(int x=1;x<numbers.length; x++){
      if(max<numbers[x]){
        max=numbers[x];
      }
      if(min>numbers[x]){
        min=numbers[x];
      }
    }
    System.out.println("Sum of Array = "+sum);
    System.out.println("Average of Array = "+((float)sum/numbers.length));
     System.out.println("Maximum number of Array = "+max);
     System.out.println("Minimum number of Array = "+min);

  }
}
