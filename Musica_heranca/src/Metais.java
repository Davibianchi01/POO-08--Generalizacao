public class Metais extends InstrumentoMusical {

    public Metais(String nome) {
        super(nome);
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Metais [");
        builder.append("nome=").append(getNome());
        builder.append("]");
        return builder.toString();
    }
}