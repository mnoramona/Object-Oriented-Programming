package lab5.problema1;

class Caine extends Animal {
    private static String tipRasa;

    {
        tipRasa = "medie";
        System.out.println("Bloc 1 - Caine " + getCuloare());
    }

    static {
        System.out.println("Bloc 2 - Caine");
    }
    {
        System.out.println("Bloc 4 - Caine");
        tipRasa = "mica";
    }

    {
        System.out.println("Bloc 3 - Caine");
        tipRasa = "mare";
    }
}
