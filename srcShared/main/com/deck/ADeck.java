package main.com.deck;


import main.com.card.ACard;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Generic deck class
 *
 * @param <TCard> What card to use for deck depending on the deck that is being
 *                created
 * @author Frederik Rosenberg
 */
public abstract class ADeck<TCard extends ACard<?, ?>> {

    List<TCard> cards;

    public ADeck() {
        cards = new ArrayList<TCard>();
    }

    /**
     * Puts the card in the back of the deck.
     *
     * @param card
     */
    public void PutCardBack(TCard card) {
        cards.add(cards.size(), card);
    }

    /**
     * Take the most back card from the beck.
     *
     * @return card
     */
    public TCard TakeCardBack() {
        TCard card = cards.get(cards.size() - 1);
        cards.remove(cards.size() - 1);
        return card;
    }

    /**
     * Puts the card in the front of deck.
     *
     * @param card
     */
    public void PutCardFront(TCard card) {
        cards.add(0, card);
    }

    /**
     * Takes the front card out of the deck
     *
     * @return the card in front
     * If no card it returns null
     */
    public TCard TakeCardFront() {
        TCard card = cards.get(0);
        cards.remove(0);
        return card;
    }

    /**
     * Get the number of cards in the deck
     *
     * @return number of cards in deck
     */
    public int GetCardsLeft() {
        return cards.size();
    }

    /**
     * Shuffles all the cards in the deck
     */
    public void Shuffle() {
	Collections.shuffle(cards);
    }
    
    /**
     * Should make a default deck for the start of a game.
     */
    abstract public void PopulateDeck();
    
}







