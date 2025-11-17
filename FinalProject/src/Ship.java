

public class Ship {
	int length;
	String name;
	Orientation  orientation;
	int startRow;
	int startCol;
	boolean [] hits;
	boolean sunk;
	
	public Ship(String name, int length, Orientation orientation) {
	    this.name = name;
	    this.length = length;
	    this.orientation = orientation;
	    this.hits = new boolean[length]; 
	    this.startRow = -1; 
	    this.startCol = -1;
	}



	public enum Orientation {
	    HORIZONTAL,
	    VERTICAL
	}
	 public void setPosition(int startRow, int startCol) {
		 this.startRow = startRow;
		 this.startCol = startCol;
		 
		 if(hits == null) {
			 hits = new boolean [length];
		 }
		 
	    }
	 
	 public void registerHit(int row, int col) {
		 int index = -1;
		 if(orientation == Orientation.HORIZONTAL) {
			 index = col - startCol;
		}else {
			index = row - startRow;
		}
		 if (index >= 0 && index < length) {
		        hits[index] = true;
		        boolean allHit = true;
		        for (boolean h : hits) {
		            if (!h) {
		                allHit = false;
		                break;
		            }
		        }
		        sunk = allHit;
		    }
	    }

	 public boolean isSunk() {
	        for (boolean h : hits) {
	            if (!h) {
	                return false;
	            }
	        }
	        return true;
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
