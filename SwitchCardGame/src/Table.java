import java.util.ArrayList;

public class Table {
	
	protected static ArrayList<Card> tableCards = new ArrayList<Card>();
	
	public Table(Card startingCard) {
		tableCards.add(startingCard);
	}
	
	public void cardPlayed(Card aCard) {
		tableCards.add(aCard);
	}
	
	public static Card topCard() {
		return tableCards.get(tableCards.size() - 1);
	}
	
	public String tableToString() {
		return tableCards.get(tableCards.size() - 1).cardToString();
	}
}
