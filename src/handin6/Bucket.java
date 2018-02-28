package handin6;

public class Bucket
{
   private int[] bucket;
   private int count; // the next free place in the bucket

   /*
    * size is the maximum number of elements that can be held in this bucket.
    * You may assume that the user of the bucket never inserts more than 'size'
    * elements.
    */
   public Bucket(int size)
   {
      bucket = new int[size];
      count = 0;
   }

   /* Inserts x on the next free place in the bucket */
   public void insert(int x)
   {

      bucket[count] = x;
      count++;

   }

   /* Sorts bucket, using a simple sorting method */
   public void sort()
   {

      for (int i = (bucket.length - 1); i >= 0; i--)
      {
         for (int j = 1; j <= i; j++)
         {
            if (bucket[j - 1] > bucket[j])
            {
               int temp = bucket[j - 1];
               bucket[j - 1] = bucket[j];
               bucket[j] = temp;
            }
         }
      }
   }

   /*
    * Copies the bucket elements into A; first is the first place in A to copy
    * an element from the bucket. The method returns how many elements have been
    * copied from the bucket
    */
   public int copyBucketInto(int[] A, int first)
   {
      int count = 0;
      for (int i = 0; i < bucket.length; i++)
      {
         if (bucket[i] > 0)
         {
            A[first] = bucket[i];
            first++;
            count++;
         }
      }
      return count;
   }

   public static void bucketSort(int[] A, int m)
   {

      Bucket b1 = new Bucket(m);
      Bucket b2 = new Bucket(m);
      Bucket b3 = new Bucket(m);
      Bucket b4 = new Bucket(m);
      for (int i = 0; i < A.length; i++)
      {
         if (A[i] < 25)
            b1.insert(A[i]);
         else if (A[i] < 50)
            b2.insert(A[i]);
         else if (A[i] < 75)
            b3.insert(A[i]);
         else
            b4.insert(A[i]);
      }
      b1.sort();
      b2.sort();
      b3.sort();
      b4.sort();
      int count = 0;
      for (int j = 0; j <= 3; j++)
      {

         if (j == 0)
            count = b1.copyBucketInto(A, 0);

         if (j == 1)
            count += b2.copyBucketInto(A, count);

         if (j == 2)
            count += b3.copyBucketInto(A, count);

         if (j == 3)
            count += b4.copyBucketInto(A, count);

      }
   }
}
