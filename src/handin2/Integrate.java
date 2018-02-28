package handin2;

public class Integrate
{
   public static double middleSum(Function fct, double a, double b, int n)
   {
      double deltaX = (b - a) / n;
      double x = a + deltaX / 2.0;
      double sum = 0.0;
      for (int i = 0; i < n; i++)
      {
         sum = sum + fct.f(x); // the value of the function in x
         x = x + deltaX;
      }
      return sum * deltaX;
   }

   public static double leftSum(Function fct, double a, double b, int n)
   {
      double deltaX = (b - a) / n;
      double x = a;
      double sum = 0.0;
      for (int i = 0; i < n; i++)
      {
         sum = sum + fct.f(x); // the value of the function in x
         x = x + deltaX;
      }
      return sum * deltaX;
   }

   public static double rightSum(Function fct, double a, double b, int n)
   {
      double deltaX = (b - a) / n;
      double x = a + deltaX ;
      double sum = 0.0;
      for (int i = 0; i < n; i++)
      {
         sum += fct.f(x); // the value of the function in x
         x += deltaX;
      }
      return sum * deltaX;
   }
}