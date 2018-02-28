package handin4;

public class Test
{

   public static void main(String[] args)
   {
     double result1=BiSection.biSectionIteration(new F1(), -1.0, 6.0, 0.0001);
     double result2=BiSection.biSectionRecursion(new F1(), -1.0, 6.0, 0.0001);
     System.out.println("Result 1 :"+result1+"\nResult 2 : "+result2);
     
   }
}
