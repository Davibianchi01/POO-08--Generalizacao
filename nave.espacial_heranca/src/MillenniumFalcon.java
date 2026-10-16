public class MillenniumFalcon extends Apolo11 {

    private float classeHiperpropulsor;

    public MillenniumFalcon(double velocidadeMaxima,
                            String tipoCombustivel,
                            float classeHiperpropulsor) {
        super(velocidadeMaxima, tipoCombustivel);
        this.classeHiperpropulsor = classeHiperpropulsor;
    }

    public float getClasseHiperpropulsor() {
        return classeHiperpropulsor;
    }

    public void setClasseHiperpropulsor(float classeHiperpropulsor) {
        this.classeHiperpropulsor = classeHiperpropulsor;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("MillenniumFalcon [");
        builder.append("velocidadeMaxima=").append(getVelocidadeMaxima());
        builder.append(", tipoCombustivel=").append(getTipoCombustivel());
        builder.append(", classeHiperpropulsor=").append(classeHiperpropulsor);
        builder.append("]");
        return builder.toString();
    }
}