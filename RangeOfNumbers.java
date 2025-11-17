import java.util.Scanner;
public class RangeOfNumbers {
   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      
      System.out.print("Start? ");
      int num1 = scan.nextInt();
      
      
      System.out.print("End? ");
      int num2 = scan.nextInt();
      
      int i = num1;
      System.out.print(i);
      if (num2>num1) {
         while (num2>i) {
            i++;
            System.out.print(", " + i);

      }
      } else {
         while (num2<i) {
      
           i--;
            System.out.print(", " + i);
      
          }
      }
   
     

   
   
   }
    
}