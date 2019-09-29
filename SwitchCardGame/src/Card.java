
public class Card {
	
	private int rank;
	private int suit;
	
	public Card(int rank, int suit) {
		this.rank = rank;
		this.suit = suit;
	}
	
	public int getRank() {
		return this.rank;
	}
	
	public int getSuit() {
		return this.suit;
	}
	
	public String rankToString() {
		String card = "";
		
		switch (rank) {
		case 0:
			card += "Ace";
			break;
		case 10:
			card += "Jack";
			break;
		case 11:
			card += "Queen";
			break;
		case 12:
			card += "King";
			break;
		default:
			card += rank + 1;
			break;
		}
		return card;
	}
	
	public String suitToString() {
		String card = "";
		
		switch (suit) {
		case 0:
			card += "Spades";
			break;
		case 1:
			card += "Hearts";
			break;
		case 2:
			card += "Clubs";
			break;
		case 3:
			card += "Diamonds";
			break;
		default:
			break;
		}
		return card;
	}
	
	public String cardToString() {
		String card = "";
		switch (rank) {
		case 0:
			card += "Ace";
			break;
		case 10:
			card += "Jack";
			break;
		case 11:
			card += "Queen";
			break;
		case 12:
			card += "King";
			break;
		default:
			card += rank + 1;
			break;
		}
		
		card += " of ";
		
		switch (suit) {
		case 0:
			card += "Spades";
			break;
		case 1:
			card += "Hearts";
			break;
		case 2:
			card += "Clubs";
			break;
		case 3:
			card += "Diamonds";
			break;
		default:
			break;
		}
		
		return card;
	}
}
