import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class ArrayListPrac {
   public static void main(String[] args) {
      List<Integer> a1 = new ArrayList<Integer>();
      a1.add(3);
      a1.add(8);
      a1.add(4);
      a1.add(2);
      a1.add(3);
      minToFront(a1);
      int[] a2 = a1.toArray(new int[ a1.size() ]);
      System.out.println(Arrays.toString(a2));
   }
   
   public static void minToFront(List<Integer> a) {
      int min = a.get(0);
      for (int n : a) {
         min = Math.min(min, n);
      }
      int index = a.indexOf(min);
      for (int i = index; i > 0; i--) {
         a.add(i, a.get(i-1));
      }
      a.add(0, min);
   }   
}