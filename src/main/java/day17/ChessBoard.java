package day17;

public class ChessBoard {
   private ChessPiece[][] chessPieces = new ChessPiece[8][8];
   public ChessBoard(ChessPiece[][] chessPieces){
       this.chessPieces=chessPieces;
   }
   public void print(){
       for(ChessPiece [] i: chessPieces){
           for(ChessPiece j: i){
               System.out.print(j.getPicture());
           }
           System.out.println();
       }
   }
}
