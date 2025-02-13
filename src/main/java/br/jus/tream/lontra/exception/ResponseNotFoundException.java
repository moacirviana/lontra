package br.jus.tream.lontra.exception;

@SuppressWarnings("serial")
public class ResponseNotFoundException extends RuntimeException {

	public ResponseNotFoundException(String message) {
        super(message);
    }
}
