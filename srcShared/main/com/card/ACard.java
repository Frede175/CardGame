package main.com.card;

public abstract class ACard<TSuit, TRank> {

	TSuit suit;
	TRank rank;
	
	ACard(TSuit suit, TRank rank) {
		this.suit = suit;
		this.rank = rank;
	}
	
	ACard() {
		suit = null;
		rank = null;
	}
	
	public TSuit GetSuit() {
		return suit;
	}
	public TRank GetRank() {
		return rank;
	}
	
	
}
