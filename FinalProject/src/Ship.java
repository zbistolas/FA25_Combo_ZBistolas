
public class Ship {
	int length;
	String name;
	Orientation orientation;
	int startRow;
	int startCol;
	boolean[] hits;
	boolean sunk;

	public Ship(String name, int length, Orientation orientation) {
	    this.name = name;
	    this.length = length;
	    this.orientation = orientation;
	    this.startRow = -1;
	    this.startCol = -1;
	    this.hits = new boolean[length];  
	}
	Ship[] ships = {
		    new Ship("Carrier", 5, Ship.Orientation.HORIZONTAL),
		    new Ship("Battleship", 4, Ship.Orientation.HORIZONTAL),
		    new Ship("Cruiser", 3, Ship.Orientation.HORIZONTAL),
		    new Ship("Submarine", 3, Ship.Orientation.HORIZONTAL),
		    new Ship("Destroyer", 2, Ship.Orientation.HORIZONTAL)
		};
	
	
	
	
	public enum Orientation {
		HORIZONTAL, VERTICAL
	}

	public void setPosition(int startRow, int startCol) {
		this.startRow = startRow;
		this.startCol = startCol;

	}

	public void registerHit(int row, int col) {
		int index = -1;
		if (orientation == Orientation.HORIZONTAL) {
			index = col - startCol;
		} else {
			index = row - startRow;
		}
		if (index >= 0 && index < length) {
			hits[index] = true;
			boolean allHit = true;

			for (int i = 0; i < hits.length; i++) {
			    if (!hits[i]) {
			        allHit = false;
			        break;
			    }
			}

			sunk = allHit;
		}
	}

	public boolean isSunk() {
	    return sunk;
	}
	public boolean occupies(int row, int col) {
		if (orientation == Orientation.HORIZONTAL) {
			return (row == startRow) && (col >= startCol) && (col < startCol + length);
		} else { // VERTICAL
			return (col == startCol) && (row >= startRow) && (row < startRow + length);
		}
	}

	public int getLength() {
		return length;
	}

	public String getName() {
		return name;
	}

	public Orientation getOrientation() {
		return orientation;
	}

	public int getStartRow() {
		return startRow;
	}

	public int getStartCol() {
		return startCol;
	}

}
