package org.example;

public class Card {
	private final String face; // face of card ("Ace", "Deuce", "Trey", ...)
	private final String suit; // suit of card ("Hearts", "Diamonds", ...)

	// two-argument constructor initializes card's face and suit
	public Card(String face, String suit) {
		this.face = face;
		this.suit = suit;
	}

	public Card(Card card){
		this.face = card.face;
		this.suit = card.suit;
	}

	// return String representation of Card
	public String toString() {
		return face + " of " + suit;
	}

	public int getPoint() {
		int point = -1;
		
		// TODO

		if(this.face.equals("Ace")){
			point = 20;
		}
		else if(this.face.equals("Deuce")){
			point = 2;
		}
		else if(this.face.equals("Three")){
			point = 3;
		} 
		else if(this.face.equals("Four")){
			point = 4;
		}
		else if(this.face.equals("Five")){
			point = 5;
		}
		else if(this.face.equals("Six")){
			point = 6;
		}
		else if(this.face.equals("Seven")){
			point = 7;
		}
		else if(this.face.equals("Eight")){
			point = 8;
		}
		else if(this.face.equals("Nine")){
			point = 9;
		}
		else if(this.face.equals("Ten")){
			point = 10;
		}
		else if(this.face.equals("Jack")){
			point = 11;
		}
		else if(this.face.equals("Queen")){
			point = 12;
		}
		else if(this.face.equals("King")){
			point = 13;
		}

		
		return point;
	}

} // end class Card

