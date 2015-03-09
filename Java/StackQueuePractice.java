import java.util.*;

public class StackQueuePractice {

   public static void main(String[] args) {
      Stack<Integer> s = new Stack<Integer>();
      s.push(1);
      s.push(-3);
      s.push(4);
      s.push(0);
      s.push(-10);
      s.push(-4);
      s.push(20);
      s.push(-5);
      System.out.println(s);
      splitStack(s);
      System.out.println(s);
   }
   
   private static void splitStack(Stack<Integer> s) {
      Queue<Integer> q =  new LinkedList<Integer>();
      while (!s.isEmpty()) {
         q.add(s.pop());
       }
       for (int i = 1; i <= q.size(); i++) {
           int current = q.remove();
           if (current < 0) {
               s.push(current);
           } else {
               q.add(current);
         }
       }
       for (int i = 1; i <= q.size(); i++) {
           s.push(q.remove());
       }
   }
}