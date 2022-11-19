package lab5.problema1;

class SharPei extends Caine {
    private static int varsta;
    private static String taraProvenienta;

    static {
        System.out.println("Bloc 1 - SharPei");
        taraProvenienta = "China";
    }
    static {
        System.out.println("Bloc 2 - SharPei " + taraProvenienta);
    }


    {
        varsta = 5;
        System.out.println("Bloc 3 - SharPei " + varsta);
    }
}
