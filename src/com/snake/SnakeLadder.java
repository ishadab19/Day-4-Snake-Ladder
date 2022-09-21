package com.snake;

import java.util.*;

public class SnakeLadder {
	public static void main(String[] args) {
		int start =0;
		int userPosition = 0;
		int count = 0;
		System.out.println("Player Starting Position will be:~ ");
		System.out.println(+start);
		Random random = new Random();
		while (userPosition != 100) {
			count++;

			int dice = random.nextInt(6) + 1;
			System.out.println("dice roll result: " + dice);

			int cases = random.nextInt(3);
			switch (cases) {
			case 0:
				System.out.println("No Play!!");
				break;
			case 1:
				System.out.println("Ladder!");
				userPosition = userPosition + dice;
				if(userPosition >100)
				{
					userPosition = dice;
				}

				break;
			default:
				System.out.println("Snake!");
				userPosition = userPosition - dice;

				if (userPosition < 0) {
					userPosition = 0;
				}
			}System.out.println("Number of times user played "+count+" to reach: "+userPosition);
			System.out.println("Presnt Position of the User: " + userPosition);
			
		}
		System.out.println("User has rolled "+count+" times to win!");
		
	}
}
