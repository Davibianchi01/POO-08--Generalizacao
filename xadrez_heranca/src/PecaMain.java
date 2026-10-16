public class PecaMain {

    public static void main(String[] args) {

        Peao peao = new Peao(7, 4, true, 0);
        Torre torre = new Torre(1, 1, true, 0);
        Rei rei = new Rei(1, 5, true, 0);
        Rainha rainha = new Rainha(1, 4, true, 0);
        Cavalo cavalo = new Cavalo(1, 2, true, 0);
        Bispo bispo = new Bispo(1, 3, true, 0);

        System.out.println(peao);
        System.out.println(torre);
        System.out.println(rei);
        System.out.println(rainha);
        System.out.println(cavalo);
        System.out.println(bispo);

        System.out.println(peao.mover(6, 4));
        System.out.println(torre.mover(4, 1));

        System.out.println(peao);
        System.out.println(torre);
    }
}