package com.snake;

import java.util.*;

public class SnakeLadder {
	public static void main(String[] args) {
		int start;
		start = 0; // player starting point
		System.out.println("Player Starting Position will be:~ ");
		System.out.println(+start);
		Random random = new Random();
		int dice = random.nextInt(6) + 1;
		System.out.println("dice roll result: " + dice);
		int userPosition = 0;
		int cases = random.nextInt(3);
		switch (cases) {
		case 0:
			System.out.println("No Play!!");
			break;
		case 1:
			System.out.println("Ladder!");
			userPosition = userPosition + dice;

			break;
		default:
			System.out.println("Snake!");
			userPosition = userPosition - dice;

			if (userPosition < 0) {
				userPosition = 0;
			}
		}
		System.out.println("Presnt Position of the User: " + userPosition);
	}
}
