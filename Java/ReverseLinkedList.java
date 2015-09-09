// William Thing
// Reversing LinkedList

public class ReverseLinkedList {

   public static class LinkedListNode {
      private int value;
      private LinkedListNode next;
      
      // constructor
      public LinkedListNode(int n) {
         this(n, null);
      }
      
      public LinkedListNode(int n, LinkedListNode node) {
         this.value = n;
         this.next = node;
      }
   }

   public static void main(String args[]) {
   
      // create head of linkedlist
      LinkedListNode front = new LinkedListNode(1);
      LinkedListNode curr = front;
      // create a linkedlist linking integers 1 through 10
      for (int i = front.value+1; i <= 3; i++) {
         curr.next = new LinkedListNode(i);
         curr = curr.next;
      }
      
      // print linkedlist created to check if correct
      printList(front);
      System.out.println("<----- REVERSING LINKEDLIST ----->");
      front = reverseList(front);
      printList(front);
      
      
      /*
      System.out.println("-----> DEBUGGING <-----");
      System.out.println(front.value);
      */

   }
   
   public static LinkedListNode reverseList(LinkedListNode front) {
      // check if front next is null only 1 node; no need to reverse
      if (front.next != null) {
         // only 2 linked nodes to reverse
         LinkedListNode curr = front;
         if (front.next.next == null) {
            front = front.next;
            front.next = curr;
            curr.next = null;
         // more than 2 linked nodes to reverse
         } else {
            while (curr.next.next != null) {
               front = front.next;
               curr.next = front.next;
               front.next = curr;
            }
            // for last reversal
            LinkedListNode temp = front;
            front = curr.next;
            curr.next = front.next;
            front.next = temp;
         }
      }
      return front;
   
   
   }
   
   // takes given linkedlist and prints each individual node from
   // front to last
   public static void printList(LinkedListNode front) {
      if (front != null) {
         if (front.next == null) {
            System.out.println(front.value);
         } else {
            LinkedListNode curr = front;
            while (curr.next != null) {
               System.out.println(curr.value);
               curr = curr.next;
            }
            // print last node
            System.out.println(curr.value);
         }
      }
   }

}