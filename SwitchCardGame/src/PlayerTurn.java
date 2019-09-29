import java.util.ArrayList;

public class PlayerTurn {

	public PlayerTurn() {

	}

	public static boolean canPlayCard(ArrayList<Card> currentPlayerCards, Card cardOnTable) {
		for (int i = 0; i < currentPlayerCards.size(); i++) {
			if (currentPlayerCards.get(i).getRank() == cardOnTable.getRank()
					|| currentPlayerCards.get(i).getSuit() == cardOnTable.getSuit()) {
				return true;
			}
		}
		System.out.println("You don't have a card to play so you drew a card!\n");
		return false;
	}

	public static void givePlayerCards(int playersPlaying) {
		ArrayList<Card> temp = new ArrayList<Card>();

		for (int i = 0; i < playersPlaying; i++) {
			int totalCards = SwitchGame.deckOfCards.size();
			for (int j = totalCards; j > (totalCards - 7); j--) {
				temp.add(SwitchGame.deckOfCards.get(i));
				SwitchGame.deckOfCards.remove(i);
			}

			SwitchGame.players.add(new Player(temp));
			temp.clear();
		}
	}

	public static int playersPlaying() {
		int players = -1;

		while (true) {
			System.out.println("How many players are playing?");
			try {
				players = SwitchGame.inputScanner.nextInt();
				if (players < 7 && players > 1) {
					break;
				} else {
					System.out.println("The maximum players permitted is 6 and the minimum is 2. Please try again!");
					SwitchGame.inputScanner.nextLine();
				}
			} catch (Exception e) {
				System.out.println("Invalid input. Try again!");
				SwitchGame.inputScanner.nextLine();
			}
		}

//		try {
//			System.out.println("How many players are playing?");
//			players = SwitchGame.inputScanner.nextInt();
//			if (players > 6 || players < 2) {
//				System.out.println("The maximum players permitted is 6 and the minimum is 2. Please try again!");
//				SwitchGame.inputScanner.nextLine();
//				playersPlaying();
//			}
//		} catch (Exception e) {
//			System.out.println("Invalid input. Please try again!");
//			SwitchGame.inputScanner.nextLine();
//			playersPlaying();
//		}

		return players;
	}
}
