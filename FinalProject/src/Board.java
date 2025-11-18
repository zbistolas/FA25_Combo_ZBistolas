import java.util.ArrayList;

public class Board {

	private int rows;
	private int cols;
	private CellState[][] grid;
	private ArrayList<Ship> ships;

	public enum CellState {
		EMPTY, SHIP, HIT, MISS
	}

	public Board(int rows, int cols) {
		this.rows = rows;
		this.cols = cols;
		grid = new CellState[rows][cols];
		ships = new ArrayList<>();
		for (int r = 0; r < rows; r++) {
			for (int c = 0; c < cols; c++) {
				grid[r][c] = CellState.EMPTY;
			}
		}
	}

	public void placeShip(Ship ship, int startRow, int startCol, Ship.Orientation orientation) {
		ship.setPosition(startRow, startCol);
		for (int i = 0; i < ship.getLength(); i++) {
			if (orientation == Ship.Orientation.HORIZONTAL) {
				grid[startRow][startCol + i] = CellState.SHIP;
			} else { 
				grid[startRow + i][startCol] = CellState.SHIP;
			}
		}

		ships.add(ship);
	}
	
	
	public String fireAt(int row, int col) {
		for (Ship ship : ships) {
			if (ship.occupies(row, col)) {
				ship.registerHit(row, col);
				grid[row][col] = CellState.HIT;
				if (ship.isSunk()) {
					return "SUNK " + ship.getName();
				}
				return "HIT";
			}
		}
		grid[row][col] = CellState.MISS;
		return "MISS";
	}

	public void printBoard(boolean showShips) {
		// Print column numbers
		System.out.print("  ");
		for (int c = 0; c < cols; c++) {
			System.out.print(c + " ");
		}
		System.out.println();

		for (int r = 0; r < rows; r++) {
			System.out.print(r + " ");
			for (int c = 0; c < cols; c++) {
				if (grid[r][c] == CellState.EMPTY) {
					System.out.print("~ ");
				} else if (grid[r][c] == CellState.SHIP) {
					System.out.print(showShips ? "S " : "~ ");
				} else if (grid[r][c] == CellState.HIT) {
					System.out.print("X ");
				} else if (grid[r][c] == CellState.MISS) {
					System.out.print("O ");
				}
			}
			System.out.println();
		}
	}
}