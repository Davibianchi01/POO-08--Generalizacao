public class Gato extends Mamifero {

    private String cor;

    public Gato(String nome, int idade, String pelagem, String cor) {
        super(nome, idade, pelagem);
        this.cor = cor;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Gato [");
        builder.append("nome=").append(getNome());
        builder.append(", idade=").append(getIdade());
        builder.append(", pelagem=").append(getPelagem());
        builder.append(", cor=").append(cor);
        builder.append("]");
        return builder.toString();
    }
}