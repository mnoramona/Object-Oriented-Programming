package lab3;

public class Produs{
    String numeprodus;
    double pret;
    int cantitate;

    public Produs(String numeprodus, double pret, int cantitate){
        this.numeprodus = numeprodus;
        this.pret = pret;
        this.cantitate = cantitate;
    }
    public Produs(){
        this("0",0,0);
    }

    public String toString(){
        return "Produs: " + numeprodus + " " + pret + " " + cantitate;
    }
    public double getTotalProdus(){
        return (cantitate * pret);
    }
}
