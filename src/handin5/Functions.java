package handin5;

public class Functions
{
   public static int[] linearSearch(int[][] matrix, int key)
   {
      int row = matrix.length;
      int col = matrix[0].length;
      
      for (int j = 0; j < row; j++)
         for (int k = 0; k < col; k++)
            if (matrix[j][k] == key)
            {

               return new int[] { j, k };
            }
      return null;
   }

   public static int[] binarySearch(int[][] matrix, int key)
   {

      int row = matrix.length;
      for (int i = 0; i < row; i++)
      {
         int j = binSearch(matrix[i], key, 0, matrix[i].length - 1);
         if (j != -1) // found
         {

            return new int[] { i, j };
         }

      }
      return null;
   }

   public static int[] binarySearchTreePattern(int[][] matrix, int key)
   {
      int row = matrix.length - 1;
      int col = 0;

      while (row != 0 && col < matrix[0].length)
      {
         if (matrix[row][col] == key)
            return new int[] { row, col };
         else if (key < matrix[row][col])
            row--;
         else
            col++;

      }
      return null;
   }

   private static int binSearch(int[] A, int key, int first, int last)
   {
      if (last < first)
         return -1;
      else
      {
         int mid = (first + last) / 2;
         if (A[mid] == key)
         {
            return mid;
         }
         else if (key < A[mid])
         {
            return binSearch(A, key, first, mid - 1);
         }
         else
            return binSearch(A, key, mid + 1, last);
      }

   }
}
