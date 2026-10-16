public class VeiculoMain {

    public static void main(String[] args) {

        Veiculo v = new Veiculo(true);
        System.out.println(v);

        Caminhao cam = new Caminhao(true, 6);
        System.out.println(cam);

        Carro car = new Carro(true, 4);
        System.out.println(car);

        Moto moto = new Moto(true, 150);
        System.out.println(moto);
    }
}