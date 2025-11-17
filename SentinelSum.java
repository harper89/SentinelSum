import java.util.Scanner;
public class SentinelSum {
   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      
      System.out.print("Type a number: ");
      int number = scan.nextInt();
      int sum = number;
      
      while (number != -1) {
      
      System.out.print("Type a number: ");
      number = scan.nextInt();
      sum += number;
      
      
      }
   
      System.out.print("Sum is "+(sum+1));

   
   
   }
    
}