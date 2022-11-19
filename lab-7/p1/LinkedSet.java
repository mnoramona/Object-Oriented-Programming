package lab7.problema1;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.Set;

public class LinkedSet extends LinkedList implements Set {


    public boolean add(Object obj){
        if(!this.contains(obj)){
            return super.add(obj);
        }
        return false;
    }

    public void add (int i, Object obj){
        if(!this.contains(obj)){
            super.add(i, obj);
        }
    }

    public Object set (int i , Object obj){
        if(!this.contains(obj)){
            Object objvechi = get(i);
            super.set(i, obj);
            return objvechi;
        }
        else return null;
    }
}
