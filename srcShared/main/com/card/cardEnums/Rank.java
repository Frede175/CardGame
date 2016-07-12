package main.com.card.cardEnums;

public enum Rank {
	Ace(1, "Ace"),
	Two(2, "Two"),
	Three(3, "Three"),
	Four(4, "Four"),
	Five(5, "Five"),
	Six(6, "Six"),
	Seven(7, "Seven"),
	Eight(8, "Eight"),
	Nine(9, "Nine"),
	Ten(10, "Ten"),
	Jack(11, "Jack"),
	Queen(12, "Queen"),
	King(13, "King"),
	Joker(14, "Joker")
	;
	
	String display;
	int value;
	
	Rank(int value, String display)
	{
		this.display = display;
		this.value = value;
	}
}
