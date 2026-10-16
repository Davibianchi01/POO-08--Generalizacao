public class Ambiente {

    private float area;

    public Ambiente(float area) {
        this.area = area;
    }

    public float getArea() {
        return area;
    }

    public void setArea(float area) {
        this.area = area;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Ambiente [");
        builder.append("area=").append(area);
        builder.append("]");
        return builder.toString();
    }
}