public class Mamifero extends Animal {

    private String pelagem;

    public Mamifero(String nome, int idade, String pelagem) {
        super(nome, idade);
        this.pelagem = pelagem;
    }

    public String getPelagem() {
        return pelagem;
    }

    public void setPelagem(String pelagem) {
        this.pelagem = pelagem;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Mamifero [");
        builder.append("nome=").append(getNome());
        builder.append(", idade=").append(getIdade());
        builder.append(", pelagem=").append(pelagem);
        builder.append("]");
        return builder.toString();
    }
}