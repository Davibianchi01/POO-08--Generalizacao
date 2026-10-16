public class Banheiro extends Ambiente {

    private boolean banheira;

    public Banheiro(float area, boolean banheira) {
        super(area);
        this.banheira = banheira;
    }

    public boolean isBanheira() {
        return banheira;
    }

    public void setBanheira(boolean banheira) {
        this.banheira = banheira;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Banheiro [");
        builder.append("area=").append(getArea());
        builder.append(", banheira=").append(banheira);
        builder.append("]");
        return builder.toString();
    }
}