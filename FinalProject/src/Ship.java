public class Ship {

    private String name;
    private int length;

    private int startRow;
    private int startCol;

    private String orientation; // "H" or "V"

    private boolean[] hits;  

    public Ship(String name, int length) {
        this.name = name;
        this.length = length;
        this.hits = new boolean[length];
    }

    public String getName() {
        return name;
    }

    public int getLength() {
        return length;
    }

    public void setPosition(int row, int col) {
        this.startRow = row;
        this.startCol = col;
    }

    public void setOrientation(String orientation) {
        this.orientation = orientation;
    }

    
    public boolean occupies(int row, int col) {
        for (int i = 0; i < length; i++) {
            int r = startRow;
            int c = startCol;

            if (orientation.equalsIgnoreCase("H")) {
                c += i;
            } else {
                r += i;
            }

            if (r == row && c == col) {
                return true;
            }
        }
        return false;
    }

    
    public void registerHit(int row, int col) {
        for (int i = 0; i < length; i++) {
            int r = startRow;
            int c = startCol;

          
            if (orientation.equalsIgnoreCase("H")) {
                c += i;
            } else {
                r += i;
            }

            if (r == row && c == col) {
                hits[i] = true;
            }
        }
    }

    public boolean isSunk() {
        for (boolean h : hits) {
            if (!h) return false;
        }
        return true;
    }
}