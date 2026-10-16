public class Aluno extends Pessoa {

    private int matricula;

    public Aluno(int codigo, String nome, String endereco, int matricula) {
        super(codigo, nome, endereco);
        this.matricula = matricula;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Aluno [");
        builder.append("codigo=").append(getCodigo());
        builder.append(", nome=").append(getNome());
        builder.append(", endereco=").append(getEndereco());
        builder.append(", matricula=").append(matricula);
        builder.append("]");
        return builder.toString();
    }
}