package lab3;

class Fractie {
    private int numarator, numitor;

    public Fractie(int numarator, int numitor){
        this.numarator = numarator;
        this.numitor = numitor;
    }

    public Fractie(){
        this(0, 0);
    }

    public Fractie adunare(Fractie f){
        return new Fractie(this.numarator + f.numarator,this.numitor + f.numitor);
    }

    public String toString(){
        return numarator + "/" +  numitor;
    }

    public boolean equals(Object o){
        if(o == null) return false;
        if(!(o instanceof Fractie)) return false;
        Fractie c = (Fractie)o;
        return(c.numarator == numarator && c.numitor == numitor);
    }
    public static void main(String args[]){
        Fractie f1 = new Fractie(2, 3);
        Fractie f2 = new Fractie(4, 5);
        Fractie f3 = new Fractie(1, 2);
        System.out.println(f1.adunare(f2));
        System.out.println(f2.adunare(f3));
        System.out.println(f1.equals(f3));

    }
}
