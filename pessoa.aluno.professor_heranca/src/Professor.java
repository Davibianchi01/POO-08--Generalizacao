public class Professor extends Pessoa {

    private String disciplina;

    public Professor(int codigo, String nome, String endereco,
                     String disciplina) {
        super(codigo, nome, endereco);
        this.disciplina = disciplina;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Professor [");
        builder.append("codigo=").append(getCodigo());
        builder.append(", nome=").append(getNome());
        builder.append(", endereco=").append(getEndereco());
        builder.append(", disciplina=").append(disciplina);
        builder.append("]");
        return builder.toString();
    }
}