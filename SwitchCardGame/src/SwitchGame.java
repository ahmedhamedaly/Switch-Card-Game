import java.util.ArrayList;
import java.util.Scanner;

public class SwitchGame {
	
	public static Scanner inputScanner = new Scanner(System.in);
	public static ArrayList<Player> players = new ArrayList<Player>();
	public static ArrayList<Card> deckOfCards = new ArrayList<Card>();
	public static int magicNumber = 69;
	//public static int rotation = 1;
	
	public static void main(String[] args) {		
		// Creates a deck of cards
		Deck deck = new Deck();
		
		// Shuffles the deck of cards
		deckOfCards = deck.shuffle(deck.deckOfCards);	
		
		// Gives each player playing 7 cards
		PlayerTurn.givePlayerCards(PlayerTurn.playersPlaying());
		
		// Creates a table and places a card on the table
		Table table = new Table(deckOfCards.get(deckOfCards.size() - 1));
		deckOfCards.remove(deckOfCards.size() - 1);
		
		// The loop for the game
		while (true) {
			for (int i = 0; i < players.size(); i++) {
				//Prints current players turn, the card of the table and their cards
				System.out.println("Player " + (i + 1) + "'s Turn" + "\n\nCurrent Card: " + table.tableToString() + "\n\n" + players.get(i).playerToString());
				
				//
				
				// The current player plays a card and puts it on the table
				if (PlayerTurn.canPlayCard(players.get(i).playerCards, table.topCard())) {
					int move = players.get(i).getMove();
					if (move == magicNumber) {
						players.get(i).drawCard(deckOfCards.get(deckOfCards.size() - 1));
						deckOfCards.remove(deckOfCards.size() - 1);
					}
					else {
					table.cardPlayed(players.get(i).playCard(players.get(i).moveToCard(move)));
					}
				} 
				// If can't play a card then draw a card
				else {
					players.get(i).drawCard(deckOfCards.get(deckOfCards.size() - 1));
					deckOfCards.remove(deckOfCards.size() - 1);
				}
				
			}		
		}		
	}	
}
