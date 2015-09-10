// William Thing
// 9/10/15

public class Queen {
   private int size;
   private int row;
   private int col;
   
   // constructs Queen of ChessBoard with given n, and given location 
   // in row and col
   public Queen(ChessBoard cb, int n, int col, int row) {
      this.size = n;
      this.row = row;
      this.col = col;
      this.placement(cb);
   }
   
   public void placement(ChessBoard cb) {
      this.move(cb, this.col, this.row);
   }
   
   public void move(ChessBoard cb, int col, int row) {
      cb.placeQueen(col, row);
   }
   
   

}