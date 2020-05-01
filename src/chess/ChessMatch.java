package chess;

import boardgame.Board;

/* Regras do jogo de xadrez */
public class ChessMatch {
	/* uma partida de xadrez tem um tabuleiro */
	private Board board;

	public ChessMatch() {
		board = new Board(8, 8);
	}
	
	/* retorna uma matriz de pecas de xadrez correspondente a esta partida */
	public ChessPiece[][] getPieces() {
		ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumns()];
		
		for (int i = 0; i < board.getRows(); i++) {
			for (int j = 0; j < board.getColumns(); j++) {
				mat[i][j] = (ChessPiece) board.piece(i, j);
			}
		}
		
		return mat;
	}

}
