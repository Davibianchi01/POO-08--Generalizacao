public class Tartaruga extends Reptil {

    private boolean aquatica;

    public Tartaruga(String nome, int idade, boolean escamas,
                     boolean aquatica) {
        super(nome, idade, escamas);
        this.aquatica = aquatica;
    }

    public boolean isAquatica() {
        return aquatica;
    }

    public void setAquatica(boolean aquatica) {
        this.aquatica = aquatica;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Tartaruga [");
        builder.append("nome=").append(getNome());
        builder.append(", idade=").append(getIdade());
        builder.append(", escamas=").append(isEscamas());
        builder.append(", aquatica=").append(aquatica);
        builder.append("]");
        return builder.toString();
    }
}