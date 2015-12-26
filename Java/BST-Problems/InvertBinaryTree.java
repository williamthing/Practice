// William Thing

public class InvertBinaryTree {

   public static void main(String[] args) {
      TreeNode mainNode = new TreeNode(4);
      mainNode.left = new TreeNode(2);
      mainNode.right = new TreeNode(7);
      mainNode.left.left = new TreeNode(1);
      mainNode.left.right = new TreeNode(3);
      mainNode.right.left = new TreeNode(6);
      mainNode.right.right = new TreeNode(9);
      PreOrder(mainNode);
      System.out.println();
      mainNode = InvertTree(mainNode);
      PreOrder(mainNode);
      System.out.println();
   }
   
   public static TreeNode InvertTree(TreeNode root) {
      if (root!=null) {
         root.left = InvertTree(root.left);
         root.right = InvertTree(root.right);
         TreeNode left = root.left;
         root.left = root.right;
         root.right = left;
      }
      return root;
   }

   // prints each element of given bst in pre-order traversal
   public static void PreOrder(TreeNode root) {
      if (root != null) {
         System.out.print(root.val);
         PreOrder(root.left);
         PreOrder(root.right);
      }
   }


}