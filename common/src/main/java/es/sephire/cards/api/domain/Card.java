package es.sephire.cards.api.domain;

import java.util.HashSet;
import java.util.Set;

/**
 * A card entity.
 *
 * @author Loïc Prieto
 */
public class Card extends BaseEntity {

    /**
     * The set of attributes the card is made of.
     */
    private Set<Attribute> attributes;

    /**
     * The card type.
     */
    private CardType cardType;

    public Card() {
        super();
        this.attributes = new HashSet<>();
    }

    public Set<Attribute> getAttributes() {
        return attributes;
    }

    public void setAttributes(Set<Attribute> attributes) {
        this.attributes = attributes;
    }

    public CardType getCardType() {
        return cardType;
    }

    public void setCardType(CardType cardType) {
        this.cardType = cardType;
    }
}
