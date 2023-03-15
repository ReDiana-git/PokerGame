package org.example;

import java.security.SecureRandom;
import java.util.Scanner;
import org.example.PokerGame;

public class PokerGameTest {
	public static void main(String[] args) {
		PokerGame game = new PokerGame();
		Scanner input = new Scanner(System.in);
		DeckOfCards myDeck;

		// TODO
		while (true)
		{
			System.out.print("Please input your choice (0: quit, 1: play, 2: restart, 3: repeat): ");
			int status = input.nextInt();
			switch (status){
				case 0:
					return;
				case 1:
					game.dealFiveCards();
					myDeck = game.getMyDeckOfCards();
					break;
				case 2:
					break;
				case 3:

			}
			game.dealFiveCards();
		}
	}
} // end class PokerGameTest
