package lab6.problema0;

import java.util.Comparator;

public class Comp2 implements Comparator {
    public int compare(Object a, Object b){
        Pair pa = (Pair)a;
        Pair pb = (Pair)b;
        return((Comparable)(pa.b)).compareTo(pb.b);
    }
}
