public class Percussao extends InstrumentoMusical {

    public Percussao(String nome) {
        super(nome);
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Percussao [");
        builder.append("nome=").append(getNome());
        builder.append("]");
        return builder.toString();
    }
}