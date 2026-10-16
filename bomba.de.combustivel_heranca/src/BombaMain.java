public class BombaMain {

    public static void main(String[] args) {

        BombaGasolina gasolina = new BombaGasolina(1000, 6.20f);
        BombaEtanol etanol = new BombaEtanol(500, 4.20f);
        BombaDiesel diesel = new BombaDiesel(800, 6.00f);

        System.out.println(gasolina);
        System.out.println(etanol);
        System.out.println(diesel);

        gasolina.abastecerPorLitro(20);
        etanol.abastecerPorValor(50);

        System.out.println(gasolina);
        System.out.println(etanol);
    }
}