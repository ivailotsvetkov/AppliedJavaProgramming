package sortingMethods;

public class SortingMethods
{
   public static void countingSort(int[] array, int small, int large)
   {
      int[] count = new int[large - small + 1];
      for (int number : array)
      {
         count[number - small]++;
      }
      int z = 0;
      for (int i = small; i <= large; i++)
      {
         while (count[i - small] > 0)
         {
            array[z] = i;
            z++;
            count[i - small]--;
         }
      }
   }

   public static void bubbleSort(int ar[]) // bubble
   {
      for (int i = (ar.length - 1); i >= 0; i--)
      {
         for (int j = 1; j <= i; j++)
         {
            if (ar[j - 1] > ar[j])
            {
               int temp = ar[j - 1];
               ar[j - 1] = ar[j];
               ar[j] = temp;
            }
         }
      }
   }

   public static void selectionSort(int[] ar) // selection
   {
      for (int i = 0; i < ar.length - 1; i++)
      {
         int min = i;
         for (int j = i + 1; j < ar.length; j++)
            if (ar[j] < ar[min])
               min = j;
         int temp = ar[i];
         ar[i] = ar[min];
         ar[min] = temp;
      }
   }

   public static void insertionSort(int[] ar) // insertion
   {
      for (int i = 1; i < ar.length; i++)
      {
         int index = ar[i];
         int j = i;
         while (j > 0 && ar[j - 1] > index)
         {
            ar[j] = ar[j - 1];
            j--;
         }
         ar[j] = index;
      }
   }

   public static void bucketSort(int[] ar)
   {
      // see handin6
   }

   private static void swap(int[] arr, int i, int idx)
   {
      int temp = arr[i];
      arr[i] = arr[idx];
      arr[idx] = temp;
   }

   private void exchange(int i, int j)
   {
      int[] numbers = null;// should be initialized above if you want it to work
      int temp = numbers[i];
      numbers[i] = numbers[j];
      numbers[j] = temp;
   }

   private static int findIndexOfSmallestElementIn(int[] A, int from, int to)
   {
      int idxToSmallest = from;

      for (int index = from + 1; index <= to; index++)
      {
         if (A[index] < A[idxToSmallest])
            idxToSmallest = index;
      }

      return idxToSmallest;
   }
}
