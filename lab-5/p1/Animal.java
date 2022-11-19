package lab5.problema1;

class Animal {
    private static String nume;
    private static String culoare;
    static {
        System.out.println("Bloc 2 - Animal");
    }
    {
        System.out.println("Bloc 1 - Animal");
        nume = "Animal";
        culoare = "negru";
    }
    public static String getCuloare() {
        return culoare;
    }
}
