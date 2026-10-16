public class VHS extends Midia {

    private String titulo;

    public VHS(int codigo,
               String descricao,
               String gravadora,
               double duracao,
               String titulo) {

        super(codigo, descricao, gravadora, duracao);
        this.titulo = titulo;
    }

    @Override
    public String toString() {
        return "VHS -> " +
                super.toString() +
                ", Título: " + titulo;
    }
}