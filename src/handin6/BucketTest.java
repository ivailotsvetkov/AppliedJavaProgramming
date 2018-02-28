package handin6;

import static org.junit.Assert.*;

import org.junit.Test;

public class BucketTest {

   @Test
   public void test() {
      int[] A = { 78, 17, 39, 26, 72, 94, 21, 4, 47, 12, 68, 87 };
      int[]arr ={4, 12, 17, 21, 26, 39, 47, 68, 72, 78, 87, 94};
      Bucket.bucketSort(A, 5);
      assertArrayEquals("fail",A,arr);
   }
   @Test
   public void test2(){
      int[] A = { 78, 17, 39, 26, 72, 94, 21, 4, 47, 12, 68, 87 };
      //int[]arr ={4, 12, 17, 21, 26, 39, 47, 68, 72, 78, 87, 94};
      Bucket.bucketSort(A, 5);
      if(!isSorted(A)){
         fail();
      }
      
   }
   private boolean isSorted(int[] numbers)
      {
         for (int i = 0; i < numbers.length - 1; i++)
         {
            if (numbers[i] > numbers[i + 1])
            {
               return false;
            }
         }
         return true;
      }

}