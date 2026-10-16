public class Midia extends Item {

    private String gravadora;
    private double duracao;

    public Midia(int codigo, String descricao,
                 String gravadora, double duracao) {

        super(codigo, descricao);
        this.gravadora = gravadora;
        this.duracao = duracao;
    }

    public String getGravadora() {
        return gravadora;
    }

    public double getDuracao() {
        return duracao;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", Gravadora: " + gravadora +
                ", Duração: " + duracao + " min";
    }
}