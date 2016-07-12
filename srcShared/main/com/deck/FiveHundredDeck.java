package main.com.deck;

import main.com.card.FiveHundredCard;
import main.com.card.cardEnums.Rank;
import main.com.card.cardEnums.Suit;

public class FiveHundredDeck extends ADeck<FiveHundredCard> {

    public FiveHundredDeck() {
	super();
    }

    @Override
    public void PopulateDeck() {
	for (Suit suit : Suit.values()) {
	    for (Rank rank : Rank.values()) {
		if (rank != Rank.Joker)
		    PutCardFront(new FiveHundredCard(suit, rank));
	    }
	}

	PutCardFront(new FiveHundredCard(Suit.NONE, Rank.Joker));
	PutCardFront(new FiveHundredCard(Suit.NONE, Rank.Joker));
	PutCardFront(new FiveHundredCard(Suit.NONE, Rank.Joker));
    }

}
