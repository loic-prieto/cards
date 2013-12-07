package es.sephire.cards.client;

import es.sephire.cards.client.components.Game;
import es.sephire.cards.client.config.SpringClientConfiguration;
import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.SlickException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Client launcher.
 */
public class Launcher {
    public static void main(String[] args) throws SlickException {

        //Spring initialization
        ApplicationContext springContext = new AnnotationConfigApplicationContext(SpringClientConfiguration.class);
        Game game = springContext.getBean(Game.class);

        //Slick 2D initialization
        AppGameContainer app = new AppGameContainer(game);
        app.setDisplayMode(800, 600, false);
        app.setTitle("Card framework");
        app.start();
    }
}
