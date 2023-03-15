package org.example;

import java.util.Scanner;

public class PokerGameTest {
	public static void main(String[] args) {
		PokerGame game = new PokerGame();
		Scanner input = new Scanner(System.in);

		// TODO
		while (true)
		{
			System.out.print("Please input your choice (0: quit, 1: play, 2: restart, 3: repeat): ");
			int status = input.nextInt();
			switch (status) {
				case 0 -> {
					System.out.println("Game over!!");
					return;
				}
				case 3 -> {
					game = new PokerGame(game);
					game.dealFiveCards();
				}
				case 2 -> {
					game = new PokerGame();
					game.dealFiveCards();
				}
				default -> {
					try {
						game.dealFiveCards();
					} catch (IllegalArgumentException e) {
						System.out.println(e.getMessage());
					}
				}
			}
		}
	}
} // end class PokerGameTest
