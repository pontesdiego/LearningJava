public enum Genero {
    MASCULINO("Masculino"),
    FEMININO("Feminino");

    private final String format;

    Genero(String format) {
        this.format = format;
    }

    public String getFormat() {
        return format;
    }
}
