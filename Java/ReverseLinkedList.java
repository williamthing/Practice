// William Thing
// Reversing LinkedList Problem

public class ReverseLinkedList {

   public static class LinkedListNode {
      private int value;
      private LinkedListNode next;
      
      // creates a LinkedListNode with given n value
      public LinkedListNode(int n) {
         this(n, null);
      }
      
      // creates a LinkedListNode with given n value and next LinkedListNode
      public LinkedListNode(int n, LinkedListNode node) {
         this.value = n;
         this.next = node;
      }
   }

   public static void main(String args[]) {
      // create head of linkedlist
      LinkedListNode front = new LinkedListNode(0);
      LinkedListNode curr = front;
      // create a linkedlist linking integers 1 through 10
      for (int i = front.value+1; i <= 10; i++) {
         curr.next = new LinkedListNode(i);
         curr = curr.next;
      }
      
      // print linkedlist created to check if correct
      printList(front);
      System.out.println("<----- REVERSING LINKEDLIST ----->");
      front = reverseList(front);
      newPrintList(front);
      System.out.println("<----- RECURSIVE REVERSING LINKEDLIST ----->");
      // reversing with recursive method
      front = recurReverseList(front);
      newPrintList(front);
      
      /*
      System.out.println("-----> DEBUGGING <-----");
      System.out.println(front.value);
      */
   }
   
   // reverseList takes a given linkedlist and reverses the order of the original
   // linkedlist so that front is back and back is front and traversing in backwards order.
   public static LinkedListNode reverseList(LinkedListNode front) {
      LinkedListNode curr = front;
      LinkedListNode temp;
      while (curr != null && curr.next != null) {
         temp = front;
         front = curr.next;
         curr.next = front.next;
         front.next = temp;
      }
      return front;
   }
   
   // recurReverseList takes a given linkedlist and reverses the order of the original
   // linkedlist recursively. 
   // Front is back and back is front and traversing in backwards order.
   public static LinkedListNode recurReverseList(LinkedListNode front) {
      return recurReverseList(front, front);
   }
   
   // recurReverseList helper takes a given linkedlist and reverses the order of the original
   // linkedlist recursively. 
   // Front is back and back is front and traversing in backwards order.
   public static LinkedListNode recurReverseList(LinkedListNode front, LinkedListNode curr) {
      if (curr.next != null) {
         LinkedListNode temp = front;
         front = curr.next;
         curr.next = front.next;
         front.next = temp;
         return recurReverseList(front, curr);
      }
      return front;
   }
   
   // takes given linkedlist and prints each individual node from
   // front to last
   public static void printList(LinkedListNode front) {
      printListHelper(front);
   }
   
   // takes given linkedlist and prints each individual node from
   // front to last
   private static void printListHelper(LinkedListNode node) {
      if (node != null) {
         System.out.println(node.value);
         printListHelper(node.next);
      }
   }
   
   // takes given linkedlist and prints each individual node from
   // front to last (more elegant than previous method)
   public static void newPrintList(LinkedListNode node) {
      while (node != null && node.next != null) {
         System.out.println(node.value);
         node = node.next;
      }
      System.out.println(node.value);
   }
   
   // takes given linkedlist and prints each individual node from
   // front to last
   public static void oldPrintList(LinkedListNode front) {
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