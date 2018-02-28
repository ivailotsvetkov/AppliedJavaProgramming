package handin4;

public class BiSection
{

   public static double biSectionRecursion(Function fct, final double left,
         final double right, final double epsilon)
   {

      if (abs(left - right) < epsilon)
         return (left + right) / 2;
      else
      { // recursive case
         double middle;
         middle = (left + right) / 2;
         if (fct.f(left) * fct.f(middle) > 0) // on same side
            return biSectionRecursion(fct, middle, right, epsilon);
         else
            // opposite side
            return biSectionRecursion(fct, left, middle, epsilon);
      }
   }

   private static double abs(double d)
   {
      if (d < 0)
      {

         return -d;
      }
      else
      {
         return d;
      }
   }

   public static double biSectionIteration(Function fct, double left,
         double right, final double epsilon)
   {

      if (abs(left - right) < epsilon)
      {
         return abs(left - right) / 2;
      }
      else
      {
         while (abs(right - left) > epsilon)
         {

            double midpoint;
            midpoint = (right + left) / 2;
            if (fct.f(left) * fct.f(midpoint) > 0)
            {
               left = midpoint;
               midpoint = left - right;
            }
            else
            {
               right = midpoint;
               midpoint = left - right;
            }

         }
         return (right + left) / 2;

      }

   }
}
