import java.util.Scanner;

public class BattleshipDriver {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Board player1Board = new Board(10, 10);
        Board player2Board = new Board(10, 10);

        System.out.println("Player 1, place your ships:");
        placeShipsForPlayer(player1Board, input);

        System.out.println("\nPlayer 2, place your ships:");
        placeShipsForPlayer(player2Board, input);

        System.out.println("\nAll ships placed! Ready to start the game.");
        input.close();
    }

    
    public static void placeShipsForPlayer(Board board, Scanner input) {
        Ship[] ships = {
            new Ship("Carrier", 5),
            new Ship("Battleship", 4),
            new Ship("Cruiser", 3),
            new Ship("Submarine", 2),
            new Ship("Destroyer", 2)
        };

       
        for (Ship ship : ships) {
            boolean placed = false;

            
            while (!placed) {
                board.printBoard();
                System.out.println("Place your " + ship.getName() + " (length " + ship.getLength() + ")");

                System.out.print("Orientation (H for horizontal, V for vertical): ");
                String orientation = input.nextLine().trim().toUpperCase();

                System.out.print("Row (1-10): ");
                int row;
                try {
                    row = Integer.parseInt(input.nextLine().trim()) - 1;
                    if (row < 0 || row > 9) {
                        System.out.println("Row must be 1-10. Try again.\n");
                        continue;
                    }
                } catch (Exception e) {
                    System.out.println("Invalid row input. Try again.\n");
                    continue;
                }

                System.out.print("Column (A-J): ");
                int col;
                try {
                    char colChar = input.nextLine().trim().toUpperCase().charAt(0);
                    col = colChar - 'A';
                    if (col < 0 || col > 9) {
                        System.out.println("Column must be A-J. Try again.\n");
                        continue;
                    }
                } catch (Exception e) {
                    System.out.println("Invalid column input. Try again.\n");
                    continue;
                }

                
                if (board.canPlaceShip(ship, row, col, orientation)) {
                    board.placeShip(ship, row, col, orientation);
                    System.out.println(ship.getName() + " placed!\n");
                    placed = true; // Exit loop for this ship
                } else {
                    System.out.println("Cannot place ship there! Try a different location.\n");
                }
            }
        }
    }
}