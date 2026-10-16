public class Peao extends Peca {

    public Peao(int linha, int coluna, boolean cor, int movimentos) {
        super(linha, coluna, cor, movimentos);
    }

    @Override
    public boolean mover(int linha, int coluna) {
        int direcao = isCor() ? -1 : 1;

        if (coluna == getColuna() &&
                linha == getLinha() + direcao) {
            setLinha(linha);
            setMovimentos(getMovimentos() + 1);
            return true;
        }

        return false;
    }
}