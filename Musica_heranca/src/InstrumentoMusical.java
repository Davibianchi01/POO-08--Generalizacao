public class InstrumentoMusical {

    private String nome;

    public InstrumentoMusical(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("InstrumentoMusical [");
        builder.append("nome=").append(nome);
        builder.append("]");
        return builder.toString();
    }
}