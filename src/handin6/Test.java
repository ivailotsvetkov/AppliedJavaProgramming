package handin6;

import java.util.Arrays;

public class Test
{

   public static void main(String[] args)
   {
      int[] A = {78,17,39,26,72,94,21,4,47,12,68,87,99};
      Bucket.bucketSort(A,5);
      System.out.println(Arrays.toString(A));
   }

}
