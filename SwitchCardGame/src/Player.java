import java.util.ArrayList;

public class Player {
	
	protected ArrayList<Card> playerCards = new ArrayList<Card>();
	
	public Player(ArrayList<Card> playerCard) {
		playerCards = (ArrayList<Card>)playerCard.clone();
//		for (int i = 0; i < playerCard.size(); i++) {
//			playerCards.add(playerCard.get(i));
//		}
	}
	
	public void drawCard(Card aCard) {
		playerCards.add(aCard);
	}
	
	public Card playCard(Card aCard) {
		playerCards.remove(aCard);
		return aCard;
	}
	
	public Card moveToCard(int move) {
		return playerCards.get(move);
	}
	
	public int getMove() {
		int move = -1;
		
		while (true) {
			try {
				if (SwitchGame.inputScanner.hasNext("draw")) {
					SwitchGame.inputScanner.next();
					return SwitchGame.magicNumber;
				}
				
				move = SwitchGame.inputScanner.nextInt();
				if (move >= 0 && move <= playerCards.size() && 
						(moveToCard(move).getRank() == Table.topCard().getRank() || 
							moveToCard(move).getSuit() == Table.topCard().getSuit())) {
					break;
				} else {
					System.out.println("Invalid move! try again");
					SwitchGame.inputScanner.nextLine();
				}
			} catch (Exception e) {
				System.out.println("Invalid move! try again");
				SwitchGame.inputScanner.nextLine();
			}			
		}
//		try {
//			move = SwitchGame.inputScanner.nextInt();
//			if (move < 0 && move > playerCards.size()) {
//				System.out.println("Invalid move! try again");
//				SwitchGame.inputScanner.nextLine();
//				getMove();
//			}
//		} catch (Exception e) {
//			System.out.println("Invalid input. Please try again!");
//			SwitchGame.inputScanner.nextLine();
//			getMove();
//		}
//		
//		if ((moveToCard(move).getRank() == Table.topCard().getRank() || 
//				moveToCard(move).getSuit() == Table.topCard().getSuit())) {
//			return move;
//		} else {
//			System.out.println("You cant play that card. Try again!");
//			SwitchGame.inputScanner.nextLine();
//			//move = -1;
//			getMove();
//		}
			
		return move;
	}
	
	public String playerToString() {
		String cards = "| ";
		for (int i = 0; i < this.playerCards.size(); i++) {
			cards += playerCards.get(i).cardToString() + " | ";
		}
		cards += "\n";
		return cards;
	}
	
}
