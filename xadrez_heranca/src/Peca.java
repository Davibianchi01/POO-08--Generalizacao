public class Peca {

    private int linha;
    private int coluna;
    private boolean cor;
    private int movimentos;

    public Peca(int linha, int coluna, boolean cor, int movimentos) {
        this.linha = linha;
        this.coluna = coluna;
        this.cor = cor;
        this.movimentos = movimentos;
    }

    public int getLinha() {
        return linha;
    }

    public void setLinha(int linha) {
        this.linha = linha;
    }

    public int getColuna() {
        return coluna;
    }

    public void setColuna(int coluna) {
        this.coluna = coluna;
    }

    public boolean isCor() {
        return cor;
    }

    public void setCor(boolean cor) {
        this.cor = cor;
    }

    public int getMovimentos() {
        return movimentos;
    }

    public void setMovimentos(int movimentos) {
        this.movimentos = movimentos;
    }

    public boolean mover(int linha, int coluna) {
        if (linha >= 1 && linha <= 8 &&
                coluna >= 1 && coluna <= 8) {
            this.linha = linha;
            this.coluna = coluna;
            movimentos++;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Peca [");
        builder.append("linha=").append(linha);
        builder.append(", coluna=").append(coluna);
        builder.append(", cor=").append(cor);
        builder.append(", movimentos=").append(movimentos);
        builder.append("]");
        return builder.toString();
    }
}