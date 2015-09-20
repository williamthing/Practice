// William Thing
// 
// Depth First Search Implementation through recursion
// pre-order, in-order, and post-order traversal

import java.util.Stack;

public class DFS {

   public static void main(String[] args) {
      Stack<Integer> path = new Stack<Integer>();
      path.push(4);
      path.push(1);
      path.push(2);
      path.push(9);
      path.push(20);
      path.push(15);
      path.push(7);
      TreeNode root = new TreeNode(5);
      while (!path.isEmpty()) {
         int val = path.pop();
         addNode(root, val);
      }
      depthFirstSearch(root, "Pre-Order");
      depthFirstSearch(root, "In-Order");
      depthFirstSearch(root, "Post-Order");
   }
   
   // adds node to a pre-existing bst or creates one
   public static TreeNode addNode(TreeNode node, int val) {
      if (node == null) {
         return new TreeNode(val);
      } else {
         if (val < node.val) {
            node.left = addNode(node.left, val);
         } else {
            node.right = addNode(node.right, val);
         }
      }
      return node;
   }
   
   // depth first search in a specific path depending on given traversal order
   // prints path of search
   public static void depthFirstSearch(TreeNode root, String order) {
      if (order.equals("Pre-Order")) {
         dfsPreOrder(root);
      } else if (order.equals("In-Order")) {
         dfsInOrder(root);
      } else {
         dfsPostOrder(root);
      }
      System.out.println();
   }
   
   // prints each element of given bst in pre-order traversal
   public static void dfsPreOrder(TreeNode root) {
      if (root != null) {
         System.out.print(root.val);
         dfsPreOrder(root.left);
         dfsPreOrder(root.right);
      }
   }
   
   // prints each element of given bst in in-order traversal
   public static void dfsInOrder(TreeNode root) {
      if (root != null) {
         dfsInOrder(root.left);
         System.out.print(root.val);
         dfsInOrder(root.right);
      }
   }
   
   // prints each element of given bst in post-order traversal
   public static void dfsPostOrder(TreeNode root) {
      if (root != null) {
         dfsPostOrder(root.left);
         dfsPostOrder(root.right);
         System.out.print(root.val);
      }
   }

}