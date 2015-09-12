/*
William Thing
9/11/15

Given a binary search tree (BST), find the lowest common ancestor (LCA) of two given nodes in the BST.

According to the definition of LCA on Wikipedia: “The lowest common ancestor is defined between two nodes 
v and w as the lowest node in T that has both v and w as descendants (where we allow a node to be a 
descendant of itself).”

        _______6______
       /              \
    ___2__          ___8__
   /      \        /      \
   0      _4       7       9
         /  \
         3   5
         
For example, the lowest common ancestor (LCA) of nodes 2 and 8 is 6. Another example is LCA of nodes 
2 and 4 is 2, since a node can be a descendant of itself according to the LCA definition.
*/

public class LCASolution {

   public static void main(String[] args) {
      // creates bst from above problem
      int[] treeElements = {6, 2, 8, 0, 4, 7, 9, 3, 5};
      TreeNode root = null;
      for (int i = 0; i < treeElements.length; i++) {
         root = addNode(root, treeElements[i]);
      }
      // check if tree is created properly
      printTree(root);
      
      TreeNode t1 = new TreeNode(2);
      TreeNode t2 = new TreeNode(4);
      TreeNode LCA = lowestCommonAncestor(root, t1, t2);
      System.out.println();
      System.out.println(LCA.val);
   }
   
   // returns the lowest common ancestor of the two given Tree nodes p and q
   public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
       if (root == null || p == null || q == null) return null;
       if (root.val > p.val && root.val > q.val) return lowestCommonAncestor(root.left, p, q);
       if (root.val < p.val && root.val < q.val) return lowestCommonAncestor(root.right, p, q);
       return root;
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
   
   // prints each element of given bst in pre-order traversal
   public static void printTree(TreeNode node) {
      if (node != null) {
         System.out.print(node.val);
         printTree(node.left);
         printTree(node.right);
      }
   }
}