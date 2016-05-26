package ar.edu.unq.desapp.grupoA.utils.google.exceptions;

/**
 * Exception thrown when a code exchange has failed.
 */
public class CodeExchangeException extends GetCredentialsException {

    /**
     * Construct a CodeExchangeException.
     *
     * @param authorizationUrl The authorization URL to redirect the user to.
     */
    public CodeExchangeException(String authorizationUrl) {
        super(authorizationUrl);
    }

}
