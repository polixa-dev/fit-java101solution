package com.tasks6.rle;

public class Application {
	private static final int MAX_NUMBER_OF_POSITIONS = 9;

	public static void main(String[] args) {
		if (args.length == 0 || args[0] == null || args[0].isEmpty()) {
			System.out.println();
			return;
		}

		char curChar = args[0].charAt(0);
		int charCount = 1;

		for (int i = 1; i < args[0].length(); i++) {
			if (args[0].charAt(i) == curChar & charCount < MAX_NUMBER_OF_POSITIONS) {
				charCount++;
			} else {
				System.out.printf("%c%s", curChar, charCount == 1 ? "" : String.valueOf(charCount));
				curChar = args[0].charAt(i);
				charCount = 1;
			}
		}

		System.out.printf("%c%s\n", curChar, charCount == 1 ? "" : String.valueOf(charCount));
	}
}
