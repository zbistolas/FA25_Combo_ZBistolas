import java.util.Scanner;

public class TicTacToe {
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		String[] board = new String[9];
		int player = 1;
		fillBoard(board);
		drawBoard(board);
		makeMove(board, player);
		drawBoard(board);
		player = player % 2 + 1;

	}

	private static void makeMove(String[] board, int player) {
		String marker = "x";
		if (player == 2)
			marker = "0";
		System.out.println("Where would you like to go?");
		int move = input.nextInt();
		while(Character.isDigit(board[move].charAt(0)))
		{
			board[move] = marker;
		}
		

	}

	private static void drawBoard(String[] board) {
		for (int rows = 0; rows < 9; rows++) {

			System.out.print(board[rows]);
			if (rows % 3 < 2)
				System.out.print("|");
			if (rows % 3 == 2) {
				System.out.println();
				System.out.println("_____");

			}

		}

	}

	private static void fillBoard(String[] board) {
		for (int rows = 0; rows < 9; rows++) {
			board[rows] = Integer.toString(rows);
		}
	}

}
