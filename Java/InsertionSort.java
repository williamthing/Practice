import java.util.Arrays;// for certain stuff specific (less memory)

import java.util.*; // import all libraries

public class InsertionSort {
   public static void main(String[] args) {
      int[] a = {8, 6, 5, 4, 3, 2, 1};
      System.out.println(Arrays.toString(a));
      insertionSort(a);
      System.out.println(Arrays.toString(a));
      System.out.println("HISTORY");
      char[] array = {'H', 'I', 'S', 'T'};
      System.out.println(Arrays.toString(array));
   }
   
   // post: takes in an array and sorts it from least to greatest
   public static void insertionSort(int[] a) {
      for (int i = 1; i < a.length; i++) {
         for (int j = i; j > 0; j--) {
            if (a[j] < a[j-1]) {
               // swap the numbers
               integrate(a, j-1, j);
            }
         }
      }
   }
   
   public static void integrate(int[] a, int left, int right) {
      int save = a[right];
      for (int i = right; i > left; i--) {
         a[i] = a[i-1];
      }
      a[left] = save;
   }
}