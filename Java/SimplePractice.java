import java.util.ArrayList;
import java.util.ListIterator;
import java.util.List;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Stack;

public class SimplePractice {
   public static void main(String[] args) {
      String n1 = "123";
      String n2 = "11";
      String n3 = Integer.toString(Integer.parseInt(n1)+Integer.parseInt(n2));
      System.out.println(n3);
      /*
      List<Integer> list = new ArrayList<Integer>();
      list.add(8);      
      list.add(5);
      list.add(6);
      list.add(8);
      list.add(3);
      list.add(8);
      list.add(2);
      list.add(8);
      list.add(10);
      System.out.println(list);
      ListIterator<Integer> listItr = list.listIterator();
      while (listItr.hasNext()) {
         int value = listItr.next();
         if (value == 8) {
            listItr.remove();
            listItr.add(4);
         } else if (value == 10) {
            listItr.remove();
            listItr.add(20);
         }
      }
      System.out.println(list);
      */
      Stack<Integer> s = new Stack<Integer>();
      s.add(1);
      s.add(2);
      s.add(3);
      s.add(4);
      s.add(5);
      s.add(6);
      /*
      s.add(7);
      s.add(8);
      s.add(9);
      */
      System.out.println(s);
      switchPairs(s);
      System.out.println(s);
   }
   
   public static void switchPairs(Stack<Integer> s) {
      Queue<Integer> q = new LinkedList<Integer>();
      stackToQueue(s, q);
      queueToStack(q, s);
      stackToQueue(s, q);
      int times = q.size() / 2;
      for (int i = 0; i < times; i++) {
         int first = q.remove();
         int second = q.remove();
         q.add(second);
         q.add(first);
      }
      if (q.size() % 2 != 0) {
         q.add(q.remove());
      }
      queueToStack(q, s);
   }     
   
   public static void shift(Stack<Integer> s, int n) {
      Queue<Integer> q = new LinkedList<Integer>();
      stackToQueue(s, q);
      queueToStack(q, s);
      stackToQueue(s, q);
      for (int i = 0; i < n; i++) {
         s.push(q.remove());
      }
      stackToQueue(s, q);
      queueToStack(q, s);
   }
   
   public static boolean isConsecutive(Stack<Integer> s) {
      Queue<Integer> q = new LinkedList<Integer>();
      stackToQueue(s, q);
      queueToStack(q, s);
      boolean isConsec = true;
      int first = s.pop();
      while (!s.isEmpty()) {
         int second = s.pop();
         if (first + 1 != second) {
            isConsec = false;
         }
         q.add(first);
         first = second;
      }
      q.add(first);
      queueToStack(q, s);
      return isConsec;
   }   
   
   public static void reorder(Queue<Integer> q) {
      Stack<Integer> s = new Stack<Integer>();
      int size = q.size();
      for (int i = 0; i < size; i++) {
         int val = q.remove();
         if (val < 0) {
            s.push(val);
         } else {
            q.add(val);
         }
      }
      size = q.size();
      stackToQueue(s, q);
      for (int i = 0; i < size; i++) {
         q.add(q.remove());
      }
   }
   
   private static void queueToStack(Queue<Integer> q, Stack<Integer> s) {
      while (!q.isEmpty()) {
         s.push(q.remove());
      }
   }
   
   private static void stackToQueue(Stack<Integer> s, Queue<Integer> q) {
      while (!s.isEmpty()) {
         q.add(s.pop());
      }
   }

}