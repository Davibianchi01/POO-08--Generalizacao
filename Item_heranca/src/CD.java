public class CD extends Midia {

    private int faixas;
    private String artista;
    private String album;

    public CD(int codigo,
              String descricao,
              String gravadora,
              double duracao,
              int faixas,
              String artista,
              String album) {

        super(codigo, descricao, gravadora, duracao);

        this.faixas = faixas;
        this.artista = artista;
        this.album = album;
    }

    @Override
    public String toString() {
        return "CD -> " +
                super.toString() +
                ", Faixas: " + faixas +
                ", Artista: " + artista +
                ", Álbum: " + album;
    }
}