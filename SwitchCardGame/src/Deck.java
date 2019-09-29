import java.util.ArrayList;
import java.util.Collections;

public class Deck {

	protected ArrayList<Card> deckOfCards;
	private int suit = 4;
	private int rank = 13;

	public Deck() {
		deckOfCards = new ArrayList<Card>();

		createDeck();
	}

	public void createDeck() {
		// creates the deck with 2d object array for all the cards
		for (int i = 0; i < rank; i++) {
			for (int j = 0; j < suit; j++) {
				Card currentCard = new Card(i, j);
				deckOfCards.add(currentCard);
			}
		}
	}

	public ArrayList<Card> shuffle(ArrayList<Card> deckOfCards) {
		// shuffles the deck randomly
		Collections.shuffle(deckOfCards);
		
		return deckOfCards;
	}
}
