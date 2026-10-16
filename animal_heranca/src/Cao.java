public class Cao extends Mamifero {

    private String raca;

    public Cao(String nome, int idade, String pelagem, String raca) {
        super(nome, idade, pelagem);
        this.raca = raca;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Cao [");
        builder.append("nome=").append(getNome());
        builder.append(", idade=").append(getIdade());
        builder.append(", pelagem=").append(getPelagem());
        builder.append(", raca=").append(raca);
        builder.append("]");
        return builder.toString();
    }
}