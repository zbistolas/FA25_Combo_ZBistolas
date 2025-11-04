import java.util.Scanner;

public class TicTacToe {
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		int rows = 3;
		int cols = 3;
		String[][] board = new String[rows][cols];
		int player = 1;
		int winner = 0;
		int moves = 0;
		fillBoard(board);
		drawBoard(board);

		while (winner == 0 && moves < 9) {
			moves++;
			makeMove(board, player);
			drawBoard(board);
			winner = checkWinner(board, player);
			player = player % 2 + 1;
		}
		if (winner == 0) {
			System.out.println("Tie!");
		} else {
			System.out.printf("Player %d wins!!!", winner);
		}
	}

	private static int checkWinner(String[][] board, int player) {
		String line = "";
		for (int i = 0; i < 8; i++) {
			switch (i) {
			case 0://Top hors line
				line = board[0][0] + board[0][1] + board[0][2];
				break;
			case 1://mid hors line
				line = board[1][0] + board[1][1] + board[1][2];
				break;
			case 2:
				line = board[2][0] + board[2][1] + board[2][2];
				break;
			case 3://left vert line
				line = board[0][0] + board[1][0] + board[2][0];
				break;
			case 4://middle vert line
				line = board[0][1] + board[1][1] + board[2][1];
				break;
			case 5://right vert line
				line = board[0][2] + board[1][2] + board[2][2];
				break;
			case 6:// tl to br daig
				line = board[0][0] + board[1][1] + board[2][2];
				break;
			case 7://tr to bl diag
				line = board[0][2] + board[1][1] + board[2][0];
				break;
			}
			if (line.equals("XXX") || line.equals("OOO")) {
				return player;

			}
		}
		return 0;

	}

	private static void makeMove(String[][] board, int player) {
		int row = -1;
		int cols = -1;
		String marker = "X";
		if (player == 2)
			marker = "O";
		System.out.printf("Player %d Where would you like to go?", player);
		int move = input.nextInt();
		switch (move) {

		case 1:
			row = 0;
			cols = 0;
			break;
		case 2:
			row = 0;
			cols = 1;
			break;
		case 3:
			row = 0;
			cols = 2;
			break;
		case 4:
			row = 1;
			cols = 0;
			break;
		case 5:
			row = 1;
			cols = 1;
			break;
		case 6:
			row = 1;
			cols = 2;
			break;
		case 7:
			row = 2;
			cols = 0;
			break;
		case 8:
			row = 2;
			cols = 1;
			break;
		case 9:
			row = 2;
			cols = 2;
			break;
		}
		while (!Character.isDigit(board[row][cols].charAt(0))) {
			board[row][cols] = marker;
			System.out.printf("Player %d where would you like to go?", player);
			switch (move) {

			case 1:
				row = 0;
				cols = 0;
				break;
			case 2:
				row = 0;
				cols = 1;
				break;
			case 3:
				row = 0;
				cols = 2;
				break;
			case 4:
				row = 1;
				cols = 0;
				break;
			case 5:
				row = 1;
				cols = 1;
				break;
			case 6:
				row = 1;
				cols = 2;
				break;
			case 7:
				row = 2;
				cols = 0;
				break;
			case 8:
				row = 2;
				cols = 1;
				break;
			case 9:
				row = 2;
				cols = 2;
				break;
			}

		}
		board[row][cols] = marker;

	}

	private static void drawBoard(String[][] board) {
		for (int rows = 0; rows < 3; rows++) {
			for (int cols = 0; cols < 3; cols++) {

				System.out.print(board[rows][cols]);
				if (cols < 2)
					System.out.print("|");
			}
			System.out.println();
			if (rows < 2) {
				System.out.println("_____\n");
			}
		}

	}

	private static void fillBoard(String[][] board) {
		int index = 1;
		for (int rows = 0; rows < 3; rows++) {
			for (int cols = 0; cols < 3; cols++) {
				board[rows][cols] = Integer.toString(index);
				index++;
			}

		}
	}

}
