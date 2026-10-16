public class NaveEspacialMain {

    public static void main(String[] args) {

        NaveEspacial n = new NaveEspacial(1000);
        System.out.println(n);

        Apolo11 a = new Apolo11(5000, "Químico");
        System.out.println(a);

        MillenniumFalcon m = new MillenniumFalcon(
                25000, "Hiperpropulsão", 2.0f
        );
        System.out.println(m);
    }
}