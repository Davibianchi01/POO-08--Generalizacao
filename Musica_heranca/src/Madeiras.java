public class Madeiras extends InstrumentoMusical {

    public Madeiras(String nome) {
        super(nome);
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Madeiras [");
        builder.append("nome=").append(getNome());
        builder.append("]");
        return builder.toString();
    }
}