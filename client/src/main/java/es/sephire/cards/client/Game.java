package es.sephire.cards.client;

import es.sephire.cards.api.domain.Card;
import es.sephire.cards.api.domain.CardType;
import org.newdawn.slick.*;

import java.util.Locale;

/**
 * A game using Slick2d
 */
public class Game extends BasicGame {

    /**
     * Screen width
     */
    private static final int WIDTH = 800;
    /**
     * Screen height
     */
    private static final int HEIGHT = 600;

    /**
     * A counter...
     */
    private int counter;

    public Game() {
        super("A Slick2d game");
    }

    public void render(GameContainer container, Graphics g) throws SlickException {
        CardType ct = new CardType();
        ct.setId(1L);
        ct.setName(Locale.ENGLISH, "Land");
        Card card = new Card();
        card.setId(1L);
        card.setCardType(ct);
        card.setName(Locale.ENGLISH, "Urza's Tower");
        card.setDescription(Locale.ENGLISH, "The magnificent and definitive Urza's Tower.");
        g.drawString("I'm rendering " + card, 50, 50);

    }

    @Override
    public void init(GameContainer container) throws SlickException {
        counter = 0;
    }

    @Override
    public void update(GameContainer container, int delta) throws SlickException {
        counter++;
    }

    public static void main(String[] args) throws SlickException {
        AppGameContainer app = new AppGameContainer(new Game());
        app.setDisplayMode(WIDTH, HEIGHT, false);
        app.setForceExit(false);
        app.start();
    }

}
