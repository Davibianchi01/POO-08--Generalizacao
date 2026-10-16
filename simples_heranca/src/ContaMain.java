public class ContaMain {

    public static void main(String[] args) {

        Conta c = new Conta("Banco do Brasil", 123, 456, 1000);
        System.out.println(c);

        ContaSimples cs = new ContaSimples(
                "Caixa", 456, 789, 1000, 500
        );
        System.out.println(cs);

        ContaEspecial ce = new ContaEspecial(
                "Bradesco", 789, 123, 2000, 10, 1000
        );
        System.out.println(ce);

        c.deposito(200);
        c.saque(100);

        System.out.println(c);
    }
}