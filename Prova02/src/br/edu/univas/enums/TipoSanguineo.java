package br.edu.univas.enums;

public enum TipoSanguineo {

    APOSITIVO("APositivo"),
    ANEGATIVO("ANegativo"),
    BPOSITIVO("BPositivo"),
    BNEGATIVO("BNegativo"),
    ABPOSITIVO("ABPositivo"),
    ABNEGATIVO("ABNegativo"),
    OPOSITIVO("OPositivo"),
    ONEGATIVO("ONegativo");

    private String tipo;

    TipoSanguineo(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public TipoSanguineo fromTipo(String tipo) {
        if(tipo.equalsIgnoreCase(APOSITIVO.getTipo())){
            return APOSITIVO;
        } else if (tipo.equalsIgnoreCase(ANEGATIVO.getTipo())) {
            return ANEGATIVO;
        } else if (tipo.equalsIgnoreCase(BPOSITIVO.getTipo())) {
            return BNEGATIVO;
        } else if (tipo.equalsIgnoreCase(BNEGATIVO.getTipo())) {
            return BNEGATIVO;
        } else if (tipo.equalsIgnoreCase(ABPOSITIVO.getTipo())) {
            return ABPOSITIVO;
        } else if (tipo.equalsIgnoreCase(ABNEGATIVO.getTipo())) {
            return ABNEGATIVO;
        } else if (tipo.equalsIgnoreCase(OPOSITIVO.getTipo())) {
            return OPOSITIVO;
        } else if(tipo.equalsIgnoreCase(ONEGATIVO.getTipo())) {
            return ONEGATIVO;
        }

        return null;
    }

}
