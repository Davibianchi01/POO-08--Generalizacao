public class Cordas extends InstrumentoMusical {

    public Cordas(String nome) {
        super(nome);
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Cordas [");
        builder.append("nome=").append(getNome());
        builder.append("]");
        return builder.toString();
    }
}