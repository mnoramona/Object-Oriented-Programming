package lab3;

class Magazin{
    String numemagazin;
    Produs p1, p2, p3;


    public Magazin(String numemagazin, Produs p1, Produs p2, Produs p3){
        this.numemagazin = numemagazin;
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    public String toString(){
        return "Magazinul are: " + p1 + "\n" + p2 + "\n" + p3;
    }

    public double getTotalMagazin(){
        return(p1.getTotalProdus() + p2.getTotalProdus() + p3.getTotalProdus());
    }
    public static void main(String args[]){
        Magazin p = new Magazin("Profi", new Produs("paine", 2, 10), new Produs("lapte", 9, 25), new Produs("jacobs", 18, 4));
        System.out.println(p.getTotalMagazin());
    }
}



