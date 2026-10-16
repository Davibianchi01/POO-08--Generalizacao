public class Veiculo {

    private boolean motor;

    public Veiculo(boolean motor) {
        this.motor = motor;
    }

    public boolean isMotor() {
        return motor;
    }

    public void setMotor(boolean motor) {
        this.motor = motor;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Veiculo [");
        builder.append("motor=").append(motor);
        builder.append("]");
        return builder.toString();
    }
}