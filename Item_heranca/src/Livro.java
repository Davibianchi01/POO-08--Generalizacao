public class Livro extends Item {

    private String autor;

    public Livro(int codigo, String descricao, String autor) {
        super(codigo, descricao);
        this.autor = autor;
    }

    public String getAutor() {
        return autor;
    }

    @Override
    public String toString() {
        return "LIVRO -> " +
                super.toString() +
                ", Autor: " + autor;
    }
}