public class AnimalMain {

    public static void main(String[] args) {

        Gato gato = new Gato("Mimi", 3, "Curta", "Preto");
        System.out.println(gato);

        Cao cao = new Cao("Rex", 5, "Longa", "Pastor Alemão");
        System.out.println(cao);

        Tartaruga tartaruga = new Tartaruga("Lentinha", 10, true, true);
        System.out.println(tartaruga);

        Lagarto lagarto = new Lagarto("Léo", 2, true, "Iguana");
        System.out.println(lagarto);
    }
}