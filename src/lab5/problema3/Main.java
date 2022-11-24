package lab5.problema3;
import java.util.Scanner;
import java.util.Vector;
import java.util.Collections;

class p {

    public void myRead(Vector v) throws ExceptieNumarNegativ {
        Scanner Read = new Scanner(System.in);
        int a = 1;
        while(a > 0) {
            System.out.println("Enter an integer:");
            a = Read.nextInt();
            if (a > 0) {
                v.add(a);
                System.out.println(a);
            }
        }
            if(a < 0){
                throw new ExceptieNumarNegativ();
            }
    }
    public void myRead() {

    }

    public static void main (String []args) {
        Vector v = new Vector();
        try{
            p obj = new p();
            obj.myRead(v);
        } catch (ExceptieNumarNegativ e) {
            e.printStackTrace();
        } finally {
            System.out.println("Max value is: " + Collections.max(v));
        }

    }
}
