package es.sephire.cards.api.components.impl;

import es.sephire.cards.api.components.CardSystem;
import es.sephire.cards.api.components.CardSystemBuilder;
import es.sephire.cards.api.exceptions.ModuleNotFoundException;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * Implementation of the CardSystemBuilder.
 * Caches the systems.
 *
 * @author Loïc Prieto
 */
@Service
@Qualifier("main")
public class CardSystemBuilderImpl implements CardSystemBuilder {
    private Map<String, CardSystem> cardSystems;

    public CardSystemBuilderImpl() {
        this.cardSystems = new HashMap<>();
    }

    @Override
    public CardSystem getCardSystem(String moduleName) throws ModuleNotFoundException {
        CardSystem system = cardSystems.get(moduleName);

        if (system == null) {
            system = buildCardSystem(moduleName);
        }

        return system;
    }

    @Override
    public CardSystem buildCardSystem(String moduleName) throws ModuleNotFoundException {
        CardSystem system = new CardSystem();
        return system;
    }

}
