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
   
   public boolean canQueensAttack() {
      return true;
   }
   
   public void placeQueen(int col, int row) {
      if (this.board[col][row] == 0) {
         this.board[col][row] = 1;
      } else {
         this.placeQueen(col, row+1);
      }
   }
   
   public void printCanQueensAttack(boolean ans) {
      
   }
   
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