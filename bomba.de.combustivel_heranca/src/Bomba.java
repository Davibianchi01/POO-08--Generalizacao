public class Bomba {

    private double totalLitros;
    private float valorLitro;

    public Bomba(double totalLitros, float valorLitro) {
        this.totalLitros = totalLitros;
        this.valorLitro = valorLitro;
    }

    public boolean abastecerPorLitro(int litros) {
        if (litros > 0 && litros <= totalLitros) {
            totalLitros -= litros;
            return true;
        }
        return false;
    }

    public boolean abastecerPorValor(double valor) {
        double litros = valor / valorLitro;

        if (valor > 0 && litros <= totalLitros) {
            totalLitros -= litros;
            return true;
        }
        return false;
    }

    public double getTotalLitros() {
        return totalLitros;
    }

    public void setTotalLitros(double totalLitros) {
        this.totalLitros = totalLitros;
    }

    public float getValorLitro() {
        return valorLitro;
    }

    public void setValorLitro(float valorLitro) {
        this.valorLitro = valorLitro;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Bomba [");
        builder.append("totalLitros=").append(totalLitros);
        builder.append(", valorLitro=").append(valorLitro);
        builder.append("]");
        return builder.toString();
    }
}