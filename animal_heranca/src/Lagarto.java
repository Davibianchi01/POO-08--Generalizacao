public class Lagarto extends Reptil {

    private String especie;

    public Lagarto(String nome, int idade, boolean escamas,
                   String especie) {
        super(nome, idade, escamas);
        this.especie = especie;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Lagarto [");
        builder.append("nome=").append(getNome());
        builder.append(", idade=").append(getIdade());
        builder.append(", escamas=").append(isEscamas());
        builder.append(", especie=").append(especie);
        builder.append("]");
        return builder.toString();
    }
}