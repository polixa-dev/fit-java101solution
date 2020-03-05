package com.tasks3.carddeck;

public class Deck {
	private final int CARD_IN_DECK = 36;
	private final int NUMBER_OF_SUITS = 4;
	private final int NUMBER_OF_RANKS = 9;
	private int currentCardPresent;
	
	Card[] deck = new Card[CARD_IN_DECK];

	public Deck() {
		int currentCardNumber = 0;
		
		for (int i = NUMBER_OF_SUITS - 1; i >= 0; i--) {
			for (int y = NUMBER_OF_RANKS - 1; y >= 0; y--) {
				deck[currentCardNumber] = new Card(Rank.values[y], Suit.values[i]);
				currentCardNumber++;
			}
		}

		currentCardPresent = CARD_IN_DECK;
	}

	public void shuffle() {
		Card tmp;
		
		for (int i = CARD_IN_DECK - 1; i > 0; i--) {
			int index = (int) (Math.random() * (i + 1));
			
			tmp = deck[index];
			deck[index] = deck[i];
			deck[i] = tmp;
		}
	}

	public void order() {
		int number = 0;
		
		for (int i = NUMBER_OF_SUITS - 1; i >= 0; i--)
			for (int y = NUMBER_OF_RANKS - 1; y >= 0; y--) {
				deck[number].setRank(Rank.values[y]);
				deck[number++].setSuit(Suit.values[i]);
			}
	}

	public boolean hasNext() {
		return currentCardPresent != 0;
	}

	public Card drawOne() {
		return (!hasNext() ? null : deck[CARD_IN_DECK - currentCardPresent--]);
	}
}
