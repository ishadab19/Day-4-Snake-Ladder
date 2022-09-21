package com.snake;
import java.util.*;
public class SnakeLadder {
	public static void main(String[] args) {
		int start;
		start =  0; //player starting point
		System.out.println("Player Starting Position will be:~ ");
		System.out.println(+start);
		Random random = new Random();
		int dice = random.nextInt(6)+1;
		System.out.println("dice roll result: "+dice);
		
	}

}
