public class MusicaMain {

    public static void main(String[] args) {

        Metais trompete = new Metais("Trompete");
        Metais tuba = new Metais("Tuba");

        Madeiras saxofone = new Madeiras("Saxofone");
        Madeiras fagote = new Madeiras("Fagote");

        Percussao tambor = new Percussao("Tambor");
        Percussao prato = new Percussao("Prato");

        Cordas violao = new Cordas("Violão");
        Cordas piano = new Cordas("Piano");

        System.out.println(trompete);
        System.out.println(tuba);
        System.out.println(saxofone);
        System.out.println(fagote);
        System.out.println(tambor);
        System.out.println(prato);
        System.out.println(violao);
        System.out.println(piano);
    }
}