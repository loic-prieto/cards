package es.sephire.cards.api.exceptions;

/**
 * Exception that must be thrown when a module that is to be used
 * isn't found.
 *
 * @author Loïc Prieto
 */
public class ModuleNotFoundException extends RuntimeException {
    public ModuleNotFoundException(String message) {
        super(message);
    }
}
