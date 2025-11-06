import java.util.Iterator;
import java.util.Random;

public class Deck {
	private Card[] cards;

	public Deck(int n) {
		this.cards = new Card[n];
	}

	public Deck() {
		this.cards = new Card[52];
		int index = 0;
		for (int suit = 0; suit <= 3; suit++) {
			for (int rank = 1; rank <= 13; rank++) {
				cards[index] = new Card(rank, suit);
				index++;
			}
		}

	}

	public void selectionSort() {
		for (int i = 0; i < cards.length - 1; i++) {
			int bigindex = 0;
			for (int j = 1; j < cards.length - i; j++) {
				if (cards[j].compareTo(cards[bigindex]) > 0) {
					bigindex = j;

				}
				swap(bigindex, cards.length - 1 - i);
			}
		}

	}

	public void insertionSort() {
		for (int i = 1; i < cards.length; i++) {
			for (int j = i; (j > 0) && (cards[j].compareTo(cards[j - 1]) < 0); j--) {
				swap(j, j - 1);

			}

		}

	}

	public void bubbleSort() {
		for (int i = 0; i < cards.length; i++) {
			for (int j = 1; j < cards.length - i; j++) {
				if (cards[j - 1].compareTo(cards[j]) > 0) {
					swap(j - 1, j);
				}
			}

		}

	}

	private int indexLowest(int low, int high) {
		int minIndex = low;
		for (int i = low + 1; i <= high; i++) {
			if (cards[i].compareTo(cards[minIndex]) < 0) {
				minIndex = i;
			}
		}
		return minIndex;
	}

	public Deck subDeck(int low, int high) {
		Deck sub = new Deck(high - low + 1);
		for (int i = 0; i < sub.cards.length; i++) {
			sub.cards[i] = this.cards[low + i];
		}
		return sub;
	}

	private static Deck merge(Deck d1, Deck d2) {
		int n1 = d1.cards.length;
		int n2 = d2.cards.length;

		Deck d3 = new Deck(n1 + n2);

		int i = 0;
		int j = 0;

		for (int k = 0; k < d3.cards.length; k++) {

			if (i >= n1) {
				d3.cards[k] = d2.cards[j];
				j++;
			}

			else if (j >= n2) {
				d3.cards[k] = d1.cards[i];
				i++;
			}

			else if (d1.cards[i].compareTo(d2.cards[j]) <= 0) {

				d3.cards[k] = d1.cards[i];
				i++;
			} else {

				d3.cards[k] = d2.cards[j];
				j++;
			}
		}

		return d3;
	}

	public Deck mergeSort() {
		if (cards.length <= 1) {
			return this;
		}

		int mid = (cards.length - 1) / 2;

		Deck left = subDeck(0, mid);
		Deck right = subDeck(mid + 1, cards.length - 1);

		Deck sortedLeft = left.mergeSort();
		Deck sortedRight = right.mergeSort();

		Deck merged = merge(sortedLeft, sortedRight);

		return merged;
	}

	public Card[] getCards() {
		return cards;
	}

	public void shuffle() {
		for (int i = 0; i < cards.length; i++) {
			swap(i, randomInt(i, cards.length));
		}

	}

	private void swap(int i, int j) {
		Card temp = cards[i];
		cards[i] = cards[j];
		cards[j] = temp;
	}

	private static int randomInt(int low, int high) {
		Random rand = new Random();
		int num = rand.nextInt((high - low) + low);
		return num;
	}

	public void printCards() {
		int n = 0;
		for (Card card : cards) {
			System.out.print(card + ", ");
			if (n % 13 == 12 && n != 0)
				System.out.println();
			n++;
		}

	}

}
