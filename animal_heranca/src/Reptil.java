public class Reptil extends Animal {

    private boolean escamas;

    public Reptil(String nome, int idade, boolean escamas) {
        super(nome, idade);
        this.escamas = escamas;
    }

    public boolean isEscamas() {
        return escamas;
    }

    public void setEscamas(boolean escamas) {
        this.escamas = escamas;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Reptil [");
        builder.append("nome=").append(getNome());
        builder.append(", idade=").append(getIdade());
        builder.append(", escamas=").append(escamas);
        builder.append("]");
        return builder.toString();
    }
}