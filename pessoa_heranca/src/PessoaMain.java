public class PessoaMain {

    public static void main(String[] args) {

        Pessoa p = new Pessoa("Davi", "Rio do Sul");
        System.out.println(p);

        PessoaFisica pf = new PessoaFisica(
                "João",
                "Lontras",
                "000.000.000-01",
                "Casado"
        );
        System.out.println(pf);

        PessoaJuridica pj = new PessoaJuridica(
                "Cubus Soluções",
                "Rio do Sul",
                "00.000.000/0001-00",
                "Tecnologia"
        );
        System.out.println(pj);
    }
}