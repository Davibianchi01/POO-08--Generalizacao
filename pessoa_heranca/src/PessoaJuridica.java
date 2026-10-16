public class PessoaJuridica extends Pessoa {

    private String cnpj;
    private String tipoEmpresa;

    public PessoaJuridica(String nome, String endereco, String cnpj, String tipoEmpresa) {
        super(nome, endereco);
        this.cnpj = cnpj;
        this.tipoEmpresa = tipoEmpresa;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getTipoEmpresa() {
        return tipoEmpresa;
    }

    public void setTipoEmpresa(String tipoEmpresa) {
        this.tipoEmpresa = tipoEmpresa;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("PessoaJuridica [");
        builder.append("nome=").append(getNome());
        builder.append(", endereco=").append(getEndereco());
        builder.append(", cnpj=").append(cnpj);
        builder.append(", tipoEmpresa=").append(tipoEmpresa);
        builder.append("]");
        return builder.toString();
    }
}