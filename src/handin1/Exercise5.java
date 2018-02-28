package handin1;
import java.util.Scanner;

public class Exercise5
{

   public static void solving1(int N)
   {
      int count = 0;
      if (N > 0)
         for (int a = 1; a <= (3 * N - 2); a++)
            for (int b = 1; b <= (3 * N - a); b++)
               for (int c = 1; c <= (3 * N - a - b); c++)
                  if (N == (a + b + c) / 3)
                  {

                    printSolution(a, b, c);
                  }
   }

   public static long solving2(int N)
   {

      long count = 0;
      for (int a = 1; a <= 3 * N - 2; a++)
         for (int b = 1; b <= 3 * N - a - 1; b++)
         {
            int c = 3 * N - a - b;
            count++;
         }
      return count;
   }

   public static long solving3(int N)
   {
      long iteration=0;
      
      for (int a = 1; a <= 3 * N - 2; a++)
         for (int b = 1; b <= 3 * N - a - 1; b++)
         {
            iteration++;
            int c = 3 * N - a - b;
           if(a+b+c==3*N)
              iteration++;
         } 
      return iteration;
   }

   // Private help-method to be used in solving1
   private static void printSolution(int a, int b, int c)
   {
      System.out.println("<" + a + ", " + b + ", " + c + ">");
   }
}