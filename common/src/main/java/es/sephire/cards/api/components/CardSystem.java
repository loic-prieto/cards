package es.sephire.cards.api.components;

import es.sephire.cards.api.domain.Attribute;
import es.sephire.cards.api.domain.Card;

import java.util.*;

/**
 * A container for a complete card game system.
 * Manages cards and provides info about them to the rest of the applications.
 *
 * @author Loïc Prieto
 */
public class CardSystem {
    private Map<Long, Card> cards;

    public CardSystem() {
        this.cards = new HashMap<>();
    }

    public Card getCard(Long cardId) {
        return this.cards.get(cardId);
    }

    /**
     * Gets a random card from the system. Useful for developing.
     *
     * @return
     */
    public Card getRandomCard() {
        Card randomCard = null;

        Collection<Card> cardList = cards.values();
        int position = ((int) Math.random() * 100000) % cardList.size();
        int counter = 0;

        for (Card card : cardList) {
            if (counter == position) {
                randomCard = card;
                break;
            }
            counter++;
        }

        return randomCard;
    }

    /**
     * Searches for a list of cards given a name filter.
     *
     * @param cardName the filter
     * @return empty list if no card is found.
     */
    public List<Card> searchCard(String cardName) {
        List<Card> candidates = new ArrayList<>();

        //Implementation with Lucene

        return candidates;
    }

    /**
     * Adds a card to the system.
     *
     * @param card
     */
    public void addCard(Card card) {
        this.cards.put(card.getId(), card);
    }

    /**
     * Searches cards that match the specified attributes.
     *
     * @param attributes
     * @return
     */
    public List<Card> searchCardByAttributes(List<Attribute> attributes) {
        List<Card> candidates = new ArrayList<>();
        //Implementation with Lucene
        return candidates;
    }
}
