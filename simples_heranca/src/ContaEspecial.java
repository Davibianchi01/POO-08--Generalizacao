public class ContaEspecial extends Conta {

    private int diasSemJuros;
    private double limite;

    public ContaEspecial(String banco, int agencia, int numeroconta,
                         double saldo, int diasSemJuros, double limite) {
        super(banco, agencia, numeroconta, saldo);
        this.diasSemJuros = diasSemJuros;
        this.limite = limite;
    }

    public int getDiasSemJuros() {
        return diasSemJuros;
    }

    public void setDiasSemJuros(int diasSemJuros) {
        this.diasSemJuros = diasSemJuros;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("ContaEspecial [");
        builder.append("banco=").append(getBanco());
        builder.append(", agencia=").append(getAgencia());
        builder.append(", numeroconta=").append(getNumeroconta());
        builder.append(", saldo=").append(getSaldo());
        builder.append(", diasSemJuros=").append(diasSemJuros);
        builder.append(", limite=").append(limite);
        builder.append("]");
        return builder.toString();
    }
}