public class PessoaMain {

    public static void main(String[] args) {

        Pessoa p = new Pessoa(1, "Davi", "Rio do Sul");
        System.out.println(p);

        Aluno a = new Aluno(2, "João", "Lontras", 123);
        System.out.println(a);

        Professor prof = new Professor(
                3, "Maria", "Ibirama", "Programação"
        );
        System.out.println(prof);
    }
}