
public class War_Driver {

	public static void main(String[] args) {
		Card[] cards = new Card[52];
		
		
		fillCards(cards);
		printCards(cards);
		Card target = new Card(12,1);
		int cardNum = search(cards, target);
		int cardNum2 = binSearch(cards, target);
		System.out.println(target); 
		System.out.println(cardNum);
		
		
		

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

	private static void printCards(Card[] cards) {
		for(Card card : cards)
		{
			System.out.print(card + ", ");
			if(card.getRank() == 13)System.out.println();
		}
		
	}

	private static void fillCards(Card[] cards) {
		int index = 0;
		for(int suit = 0; suit <= 3; suit ++)
		{
			for(int rank = 1; rank <= 13; rank ++)
			{
				cards[index] = new Card(rank, suit);
				index++;
			}
		}

		
	}

}
