
package handin2;

import java.util.Scanner;

public class Main2Integrate
{
   public static void main(String[] args)
   {
      int choice;
      double result1, result2;
      Scanner sc = new Scanner(System.in);
      do
      {
         System.out.println("For left sum press 1 , for right sum press 2 :");
         choice = sc.nextInt();
         switch (choice)
         {
            case 1: // left sum for both functions

               
               result1 = Integrate.leftSum(new F1(), 2, 0, 100);
               result2 = Integrate.leftSum(new F2(), 3, 2, 100);

               System.out.println(
                     "Function f1(x) left sum result: " + result1 + "\nFunction f2(x) left sum result: " + result2);
               break;
            case 2: // right sum for both functions

               result1 = Integrate.rightSum(new F1(), 0, 2, 100);
               result2 = Integrate.rightSum(new F2(), 0, 3, 100);
               System.out.println(
                     "Function f1(x) right sum result: " + result1 + "\nFunction f2(x) right sum result: " + result2);
               break;
               default:
               break;
         }
      }
      while (choice > 0);
      System.out.println("** End of test Hand-in 2 **");
   }
}
