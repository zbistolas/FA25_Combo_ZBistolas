import java.util.ArrayList;

public class Board {

    private int rows;
    private int cols;
    private String[][] board;  
    private ArrayList<Ship> ships;

    public Board(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;

        board = new String[rows][cols];
        ships = new ArrayList<>();

       
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                board[r][c] = "~";
            }
        }
    }

    public boolean canPlaceShip(Ship ship, int startRow, int startCol, String orientation) {
        int length = ship.getLength();

        if (orientation.equalsIgnoreCase("H")) {
            if (startCol + length > cols) return false; // check bounds
            for (int i = 0; i < length; i++) {
                if (!board[startRow][startCol + i].equals("~")) return false; // check empty
            }
        } else { // vertical
            if (startRow + length > rows) return false; // check bounds
            for (int i = 0; i < length; i++) {
                if (!board[startRow + i][startCol].equals("~")) return false; // check empty
            }
        }

        return true;
    }

    public void placeShip(Ship ship, int startRow, int startCol, String orientation) {
        ship.setPosition(startRow, startCol);

        if (orientation.equalsIgnoreCase("H")) {
            for (int i = 0; i < ship.getLength(); i++) {
                board[startRow][startCol + i] = "S";
            }
        } else {
            for (int i = 0; i < ship.getLength(); i++) {
                board[startRow + i][startCol] = "S";
            }
        }

        ships.add(ship);
    }

    public String fireAt(int row, int col) {
        if (board[row][col].equals("S")) {
            board[row][col] = "X";

            for (Ship s : ships) {
                if (s.occupies(row, col)) {
                    s.registerHit(row, col);
                    if (s.isSunk()) return "Sunk " + s.getName() + "!";
                    return "Hit!";
                }
            }
        }

        board[row][col] = "O";
        return "Miss!";
    }

    public void printBoard() {
        // Print column headers (A, B, C, ...)
        System.out.print("  "); // space for row numbers
        for (int c = 0; c < cols; c++) {
            System.out.print((char)('A' + c) + " ");
        }
        System.out.println();

        // Print each row
        for (int r = 0; r < rows; r++) {
            // Print row number (1-based)
            System.out.print((r + 1) + (r + 1 < 10 ? " " : "")); // add extra space for 10

            for (int c = 0; c < cols; c++) {
                System.out.print(board[r][c] + " ");
            }
            System.out.println();
        }
    }
}