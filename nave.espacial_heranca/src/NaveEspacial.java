public class NaveEspacial {

    private double velocidadeMaxima;

    public NaveEspacial(double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("NaveEspacial [");
        builder.append("velocidadeMaxima=").append(velocidadeMaxima);
        builder.append("]");
        return builder.toString();
    }
}