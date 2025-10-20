
public class War_Driver {

	public static void main(String[] args) {
		Deck deck = new Deck();
		deck.shuffle();
		deck.printCards();
		
		
	}

	private static int binSearch(Card[] cards, Card target) {
		int low = 0;
		int high = cards.length -1;
		
		while(low <= high)
		{
			int mid = (low + high) / 2;
			int comp = cards[mid].compareTo(target);
			if(comp == 0)return mid;
			else if(comp < 0) {
				low = mid + 1;
			}
			else
			{
				high = mid -1;
			}
			System.out.println(low + ", " + high);
			
		}return -1;
	}

	private static int search(Card[] cards, Card target) {
		for (int i = 0; i < cards.length; i++) {
			if(cards[i].equals(target))return i;
			
		}
		return -1;
	}

	

	

}
