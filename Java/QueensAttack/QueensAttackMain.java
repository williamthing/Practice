// William Thing
// 9/10/15

public class QueensAttackMain {

   public static final int N = 8;
   public static final Queen[] QUEENS = new Queen[N];

   public static void main(String args[]) {
      ChessBoard chessBoard = new ChessBoard(N);
      for (int i = 0; i < N; i++) {
         Queen aQueen = new Queen(chessBoard, N, i, i);
         QUEENS[i] = aQueen;
      }
      chessBoard.canQueensAttack(QUEENS);
   }
   

}