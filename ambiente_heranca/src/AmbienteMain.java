public class AmbienteMain {

    public static void main(String[] args) {

        Ambiente a = new Ambiente(20);
        System.out.println(a);

        Quarto q = new Quarto(15, 2);
        System.out.println(q);

        Sala s = new Sala(25, true);
        System.out.println(s);

        Banheiro b = new Banheiro(8, true);
        System.out.println(b);

        Cozinha c = new Cozinha(12, false);
        System.out.println(c);
    }
}