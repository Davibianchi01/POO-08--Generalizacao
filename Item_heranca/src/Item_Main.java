public class Item_Main {

    public static void main(String[] args) {

        Livro livro = new Livro(
                1,
                "Programação Orientada a Objetos",
                "Deitel"
        );

        CD cd = new CD(
                2,
                "Música Internacional",
                "Sony Music",
                58.5,
                12,
                "Queen",
                "Greatest Hits"
        );

        VHS vhs = new VHS(
                3,
                "Filme Aventura",
                "Universal",
                120,
                "Jurassic Park"
        );

        System.out.println(livro);
        System.out.println(cd);
        System.out.println(vhs);
    }
}