// William Thing
// 9/10/15
// ChessBoard
//
//

import java.util.Arrays;

public class ChessBoard {
   private int[][] board;
   private int size;
   
   // constructs a chessboard with size n by n with given int
   // first n represents the column
   // second n represents the row
   public ChessBoard(int n) {
      this.size = n;
      this.board = new int[n][n];
      for (int i = 0; i < n; i++) {
         for (int j = 0; j < n; j++) {
            board[i][j] = 0;
         }
      }
   }
   
   // returns true if any queen can attack one another, else false
   // no queens can attack each other
   // TODO: Implementation of this canQueensAttack method
   public boolean canQueensAttack() {
      return true;
   }
   
   // takes int of col and row to place a Queen and places it.
   // if a queen (represented by a 1) is already at the location
   // will place it next to that queen (row wise).
   public void placeQueen(int col, int row) {
      if (this.board[col][row] == 0) {
         this.board[col][row] = 1;
      } else {
         this.placeQueen(col, row+1);
      }
   }
   
   // Prints the chessboard where 0 represents an open spot and 1 represents
   // a Queen. N Queens on the board and prints a message if any Queens can
   // attack each other or not.
   public void print() {
      for (int i = 0; i < size; i++) {
         System.out.print("\t");
         System.out.println(Arrays.toString(board[i]));
      }
      System.out.println();
      boolean ans = this.canQueensAttack();
      if (ans) {
         System.out.println("    Yes, Queens can attack each other!");
      } else {
         System.out.println("    No, Queens cannot attack one another!");
      }
   }
}