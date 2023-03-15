package org.example;


public class PokerGame {
	private DeckOfCards myDeckOfCards;

	public PokerGame() {
		// TODO
		myDeckOfCards = new DeckOfCards();
		myDeckOfCards.shuffle();
	}

	public PokerGame(PokerGame game) {
		// TODO
		myDeckOfCards = game.myDeckOfCards;
		game.myDeckOfCards.reset();
	}

	public DeckOfCards getMyDeckOfCards() {
		return this.myDeckOfCards;
	}
	
	public void dealFiveCards() {
		// TODO
		Card[] arrayCard = new Card[5];
		int totalPoint = 0;
		for(int i = 0; i < 5; i++){
			arrayCard[i] = myDeckOfCards.dealCard();
			System.out.println("You got " + arrayCard[i] + ", " + arrayCard[i].getPoint() + "points.");
			totalPoint += arrayCard[i].getPoint();
		}
		System.out.println("Your total points are " + totalPoint);

	}

} // end class PokerGame
