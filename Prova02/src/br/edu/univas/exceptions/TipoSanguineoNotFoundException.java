package br.edu.univas.exceptions;

public class TipoSanguineoNotFoundException extends RuntimeException {

    public TipoSanguineoNotFoundException() {
    }

    public TipoSanguineoNotFoundException(String message) {
        super(message);
    }
}
