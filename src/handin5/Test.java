package handin5;

public class Test
{

   public static void main(String[] args)
   {
      int[][] matrix = { { 6, 8, 13 }, { 14, 19, 21 }, { 15, 22, 23 } };
      int[] a = Functions.binarySearch(matrix, 22);
      int[] b = Functions.linearSearch(matrix, 22);
      int[] y = Functions.binarySearchTreePattern(matrix, 22);
      int i = a[0];
      int j = a[1];
      int c = b[0];
      int d = b[1];
      int rewrw=y[0];
      int eraerewa=y[1];
      System.out.println("Row: " + i + "\ncolumn: " + j);
      System.out.println("Row: " + c + "\ncolumn: " + d);
      System.out.println("Row: " + rewrw + "\ncolumn: " + eraerewa);
   }

}
