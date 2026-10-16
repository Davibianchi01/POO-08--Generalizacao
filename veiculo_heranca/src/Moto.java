public class Moto extends Veiculo {

    private int cilindradas;

    public Moto(boolean motor, int cilindradas) {
        super(motor);
        this.cilindradas = cilindradas;
    }

    public int getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Moto [");
        builder.append("motor=").append(isMotor());
        builder.append(", cilindradas=").append(cilindradas);
        builder.append("]");
        return builder.toString();
    }
}