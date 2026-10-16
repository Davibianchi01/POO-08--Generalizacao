public class Animal {

    private String nome;
    private int idade;

    public Animal(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Animal [");
        builder.append("nome=").append(nome);
        builder.append(", idade=").append(idade);
        builder.append("]");
        return builder.toString();
    }
}