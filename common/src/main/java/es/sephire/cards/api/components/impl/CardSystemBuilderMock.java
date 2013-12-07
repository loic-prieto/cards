package es.sephire.cards.api.components.impl;

import es.sephire.cards.api.components.CardSystem;
import es.sephire.cards.api.components.CardSystemBuilder;
import es.sephire.cards.api.domain.Card;
import es.sephire.cards.api.domain.CardType;
import es.sephire.cards.api.exceptions.ModuleNotFoundException;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Locale;

/**
 * Mock card system builder to use during development.
 *
 * @author Loïc Prieto
 */
@Service
@Qualifier("mock")
public class CardSystemBuilderMock implements CardSystemBuilder {

    @Override
    public CardSystem getCardSystem(String moduleName) throws ModuleNotFoundException {
        return buildCardSystem(moduleName);
    }

    @Override
    public CardSystem buildCardSystem(String moduleName) throws ModuleNotFoundException {
        return buildMockCardSystem();
    }

    private CardSystem buildMockCardSystem() {
        CardSystem cs = new CardSystem();
        cs.addCard(buildMockCard("Urza's Tower"));
        cs.addCard(buildMockCard("Urza's Prison"));
        cs.addCard(buildMockCard("Urza's City"));
        return cs;
    }

    private Card buildMockCard(String name) {
        Card card = new Card();
        card.setId(getRandomId());
        card.setName(Locale.ENGLISH, name);
        card.setDescription(Locale.ENGLISH, "A fitting card for a fitting player");
        card.setCardType(buildMockCardType());

        return card;
    }

    private CardType buildMockCardType() {
        CardType type = new CardType();
        type.setId(getRandomId());
        type.setName(Locale.ENGLISH, "Land");

        return type;
    }

    private Long getRandomId() {
        return new Long((long) Math.random() * 1000000);
    }
}
