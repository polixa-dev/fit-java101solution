package com.tasks6.rle_decoder;

public class Application {
	public static void main(String[] args) {
		if (args.length == 0 || args[0].isEmpty() || (Character.isDigit(args[0].charAt(0)))) {
			System.out.println();
			return;
		}

		if (args[0].length() == 1) {
			System.out.println(args[0]);
			return;
		}

		StringBuilder builder = new StringBuilder();
		char firstChar;
		char twoChar;

		for (int i = 0, y = 1; y < args[0].length(); i++, y++) {
			firstChar = args[0].charAt(i);
			twoChar = args[0].charAt(y);

			if (firstChar == twoChar || (Character.isDigit(firstChar) & Character.isDigit(twoChar))) {
				System.out.println();
				return;
			} else if (Character.isDigit(twoChar)) {
				for (int k = 0; k < Character.digit(twoChar, 10); k++) {
					builder.append(firstChar);
				}
			} else if (!Character.isDigit(firstChar)) {
				builder.append(firstChar);
			}

			if (y == args[0].length() - 1 && !Character.isDigit(twoChar)) {
				builder.append(twoChar);
			}
		}

		System.out.println(builder.toString());
	}
}
