// Implemented Binary Search
// Returns the index of the matching value in the array if found,
// else returns -1 for not found

public class BinarySearch {
   public static void main(String[] args) {
      int[] array = {3, 4, 5, 6, 6};
      System.out.println(binarySearch(array, 6));
   }
   
   public static int binarySearch(int[] a, int value) {
      int high = a.length -1;
      int low = 0;
      int mid;
      for (int i = 0; i < (a.length-1) / 2; i++) {
         mid = (high + low) / 2;
         if (a[mid] == value) {
            System.out.println("Hi");
            return mid;          // returns the index if value is found
            
         } else if (a[mid] > value) {
            high = mid-1;
            System.out.println("Hii");
         } else {
            low = mid+1;
            System.out.println("Hiii");
         }
      }
      return -1;  // value not found
   }
}