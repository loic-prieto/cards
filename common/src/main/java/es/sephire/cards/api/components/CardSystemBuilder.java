package es.sephire.cards.api.components;

import es.sephire.cards.api.exceptions.ModuleNotFoundException;

/**
 * Builds a card system with it's content from an xml configuration file.
 * <p/>
 * Created by Loïc on 7/12/13.
 */
public interface CardSystemBuilder {
    /**
     * Gets a card system from the card system builder.
     * If it hasn't been built yet, it does it.
     *
     * @param moduleName
     * @return
     */
    CardSystem getCardSystem(String moduleName) throws ModuleNotFoundException;

    /**
     * Builds a card system given a module name.
     * A module exists on a folder of the install dir of the application. It must
     * contain a metadata file that defines the cards and rules of the system.
     *
     * @param moduleName
     * @return
     * @throws es.sephire.cards.api.exceptions.ModuleNotFoundException
     */
    CardSystem buildCardSystem(String moduleName) throws ModuleNotFoundException;
}
