public class ContaSimples extends Conta {

    private double saldoPoupanca;

    public ContaSimples(String banco, int agencia, int numeroconta,
                        double saldo, double saldoPoupanca) {
        super(banco, agencia, numeroconta, saldo);
        this.saldoPoupanca = saldoPoupanca;
    }

    public boolean depositoPoupanca(double valor) {
        if (valor > 0) {
            saldoPoupanca += valor;
            return true;
        }
        return false;
    }

    public boolean saquePoupanca(double valor) {
        if (valor > 0 && valor <= saldoPoupanca) {
            saldoPoupanca -= valor;
            return true;
        }
        return false;
    }

    public double getSaldoPoupanca() {
        return saldoPoupanca;
    }

    public void setSaldoPoupanca(double saldoPoupanca) {
        this.saldoPoupanca = saldoPoupanca;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("ContaSimples [");
        builder.append("banco=").append(getBanco());
        builder.append(", agencia=").append(getAgencia());
        builder.append(", numeroconta=").append(getNumeroconta());
        builder.append(", saldo=").append(getSaldo());
        builder.append(", saldoPoupanca=").append(saldoPoupanca);
        builder.append("]");
        return builder.toString();
    }
}