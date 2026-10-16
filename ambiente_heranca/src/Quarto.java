public class Quarto extends Ambiente {

    private int capacidade;

    public Quarto(float area, int capacidade) {
        super(area);
        this.capacidade = capacidade;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Quarto [");
        builder.append("area=").append(getArea());
        builder.append(", capacidade=").append(capacidade);
        builder.append("]");
        return builder.toString();
    }
}