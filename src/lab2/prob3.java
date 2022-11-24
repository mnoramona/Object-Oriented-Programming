package lab2;

import java.util.Random;
import java.util.Vector;

public class prob3 {
    public static void main(String[] args){
        Vector v = new Vector();
        int i;
        for(i  = 0; i < 20; i++){
            Random generator = new Random();
            int nr = generator.nextInt(10);
            v.add(nr);
        }
        for(i = 0; i < v.size(); i++){
            System.out.println(v.get(i));
        }
    }
}
