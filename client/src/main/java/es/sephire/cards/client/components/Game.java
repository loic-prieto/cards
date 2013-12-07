package es.sephire.cards.client.components;

import es.sephire.cards.api.components.CardSystem;
import es.sephire.cards.api.components.CardSystemBuilder;
import es.sephire.cards.api.domain.Card;
import org.newdawn.slick.BasicGame;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.Locale;

/**
 * A game using Slick2d
 */
@Component
public class Game extends BasicGame {

    @Autowired
    @Qualifier("mock")
    private CardSystemBuilder cardSystemBuilder;

    /**
     * A counter...
     */
    private int counter;
    private CardSystem cardSystem;
    private Card card;

    public Game() {
        super("A Slick2d game");
    }

    public void render(GameContainer container, Graphics g) throws SlickException {

        g.drawString("I'm rendering " + card.getName(Locale.ENGLISH), 50, 50);

    }

    @Override
    public void init(GameContainer container) throws SlickException {
        counter = 0;
        cardSystem = cardSystemBuilder.getCardSystem("wow");
        card = cardSystem.getRandomCard();
    }

    @Override
    public void update(GameContainer container, int delta) throws SlickException {
        counter++;
    }

}
