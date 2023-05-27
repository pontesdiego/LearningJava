public enum UnidadeFederativa {
    BAHIA("Bahia", "BA"),
    RIO_DE_JANEIRO("Rio de Janeiro", "RJ"),
    SAO_PAULO("São Paulo", "SP");

    private final String estado;
    private final String sigla;

    UnidadeFederativa(String estado, String sigla) {
        this.estado = estado;
        this.sigla = sigla;
    }

    public String getEstado() {
        return estado;
    }

    public String getSigla() {
        return sigla;
    }
}
