package es.sephire.cards.client.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Spring configuration for the client.
 *
 * @author Loïc
 */
@Configuration
@ComponentScan(basePackages = {"es.sephire.cards.api.components", "es.sephire.cards.client.components"})
public class SpringClientConfiguration {

}
