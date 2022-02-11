package day17;

public class Task2 {
    public static void main(String[] args) {
//        ChessPiece[][] chessPieces =
//                {{ChessPiece.ROOK_BLACK, ChessPiece.EMPTY, ChessPiece.EMPTY, ChessPiece.EMPTY, ChessPiece.EMPTY, ChessPiece.ROOK_BLACK, ChessPiece.KING_BLACK, ChessPiece.EMPTY},
//                        {ChessPiece.EMPTY, ChessPiece.ROOK_WHITE, ChessPiece.EMPTY, ChessPiece.EMPTY, ChessPiece.PAWN_BLACK, ChessPiece.PAWN_BLACK, ChessPiece.EMPTY, ChessPiece.PAWN_BLACK},
//                        {ChessPiece.PAWN_BLACK,ChessPiece.EMPTY,ChessPiece.KNIGHT_BLACK, ChessPiece.EMPTY,ChessPiece.EMPTY,ChessPiece.EMPTY, ChessPiece.PAWN_BLACK,ChessPiece.EMPTY},
//                        {ChessPiece.QUEEN_BLACK,ChessPiece.EMPTY,ChessPiece.EMPTY,ChessPiece.BISHOP_WHITE,ChessPiece.EMPTY,ChessPiece.EMPTY,ChessPiece.EMPTY, ChessPiece.EMPTY},
//                        {ChessPiece.EMPTY,ChessPiece.EMPTY,ChessPiece.EMPTY,ChessPiece.BISHOP_BLACK,ChessPiece.PAWN_WHITE,ChessPiece.EMPTY,ChessPiece.EMPTY,ChessPiece.EMPTY},
//                        {ChessPiece.EMPTY,ChessPiece.EMPTY,ChessPiece.EMPTY,ChessPiece.EMPTY,ChessPiece.BISHOP_WHITE,ChessPiece.PAWN_WHITE,ChessPiece.EMPTY,ChessPiece.EMPTY},
//                        {ChessPiece.PAWN_WHITE,ChessPiece.EMPTY,ChessPiece.EMPTY,ChessPiece.QUEEN_WHITE,ChessPiece.EMPTY,ChessPiece.PAWN_WHITE,ChessPiece.EMPTY,ChessPiece.PAWN_WHITE},
//                        {ChessPiece.EMPTY,ChessPiece.EMPTY,ChessPiece.EMPTY,ChessPiece.EMPTY,ChessPiece.EMPTY,ChessPiece.ROOK_WHITE,ChessPiece.KING_WHITE, ChessPiece.EMPTY}};
//
//        ChessBoard chessBoard=new ChessBoard(chessPieces);
//        chessBoard.print();

        ChessPiece[][] chessPieces2 = new ChessPiece[8][8];
        chessPieces2[0][0]=ChessPiece.ROOK_BLACK;
        chessPieces2[0][5]=ChessPiece.ROOK_BLACK;
        chessPieces2[0][6]=ChessPiece.KING_BLACK;

        chessPieces2[1][1]=ChessPiece.ROOK_WHITE;
        chessPieces2[1][4]=ChessPiece.PAWN_BLACK;
        chessPieces2[1][5]=ChessPiece.PAWN_BLACK;
        chessPieces2[1][7]=ChessPiece.PAWN_BLACK;

        chessPieces2[2][0]=ChessPiece.PAWN_BLACK;
        chessPieces2[2][2]=ChessPiece.KNIGHT_BLACK;
        chessPieces2[2][6]=ChessPiece.PAWN_BLACK;

        chessPieces2[3][0]=ChessPiece.QUEEN_BLACK;
        chessPieces2[3][3]=ChessPiece.BISHOP_WHITE;

        chessPieces2[4][3]=ChessPiece.BISHOP_BLACK;
        chessPieces2[4][4]=ChessPiece.PAWN_WHITE;

        chessPieces2[5][4]=ChessPiece.BISHOP_WHITE;
        chessPieces2[5][5]=ChessPiece.PAWN_WHITE;

        chessPieces2[6][0]=ChessPiece.PAWN_WHITE;
        chessPieces2[6][3]=ChessPiece.QUEEN_WHITE;
        chessPieces2[6][5]=ChessPiece.PAWN_WHITE;
        chessPieces2[6][7]=ChessPiece.PAWN_WHITE;

        chessPieces2[7][5]=ChessPiece.ROOK_WHITE;
        chessPieces2[7][6]=ChessPiece.KING_WHITE;

        for(int i=0; i<chessPieces2.length; i++){
            for(int j=0; j<chessPieces2[i].length; j++){
               if(chessPieces2[i][j]==null){ chessPieces2[i][j]= ChessPiece.EMPTY;}
            }
        }

        ChessBoard chessBoard2=new ChessBoard(chessPieces2);
        chessBoard2.print();
    }
}
