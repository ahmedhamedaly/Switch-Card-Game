import java.util.ArrayList;

public class SpecialCards {
	ArrayList<Card> specialCards = new ArrayList<Card>();
	
	public SpecialCards(ArrayList<Card> allSpecialCards) {
		specialCards = (ArrayList<Card>) allSpecialCards.clone();
	}
	
	public boolean isCardSpecial(Card aCard) {
		for (int i = 0; i < specialCards.size(); i++) {
			if (specialCards.get(i).equals(aCard))
				return true;
		}
		return false;
	}
	
	public void pickUpCards(Player currentPlayer, int numberOfCards) {
		int totalCards = SwitchGame.deckOfCards.size();
		
		for (int i = totalCards; i > (totalCards - numberOfCards) ; i--) {
			currentPlayer.drawCard((SwitchGame.deckOfCards.get(i)));
			SwitchGame.deckOfCards.remove(i);
		}	
	}
	
	
	
}
