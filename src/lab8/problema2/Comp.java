package lab8.problema2;

import java.util.Comparator;

public class Comp implements Comparator {
    public int compare(Object a, Object b){
        Catalog.Student sa = (Catalog.Student)a;
        Catalog.Student sb = (Catalog.Student)b;
        return((Comparable)(sa.media)).compareTo(sb.media);
    }
}
