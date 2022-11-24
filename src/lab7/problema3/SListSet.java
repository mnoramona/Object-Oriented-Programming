//package lab7.problema3;
//
//import java.util.Collections;
//import java.util.Comparator;
//import java.util.LinkedList;
//import java.util.SortedSet;
//
//public class SListSet extends LinkedList implements SortedSet {
//
//    private Comparator compnull = null;
//
//    public SListSet(){
//        compnull = null;
//    }
//    public SListSet Comparator(Comparator compnull){
//        this.compnull = compnull;
//    }
//
//    public Comparator Comparator(){
//        return this.compnull;
//    }
//    public boolean add(Object obj){
//        if(!this.contains(obj)){
//            super.add(obj);
//            Collections.sort(this);
//            return true;
//            //return super.add(obj);
//        }
//        return false;
//    }
//    public Object first() {
//        if(super.size() == 0){
//            return null;
//        }
//        else return super.get(0);
//    }
//
//    public Object last() {
//        int n;
//        n = super.size();
//        if(n == 0){
//            return null;
//        }
//        else return super.get(n-1);
//    }
//
//    public SortedSet subSet(Object fromElement, Object toElement) {
//        int a = super.indexOf(fromElement);
//        int b = super.indexOf(toElement);
//        SListSet st = (SListSet) super.subList(a, b);
//        return st;
//    }
//
//    public SortedSet headSet(Object toElement) {
//        int b = super.indexOf(toElement);
//        SListSet st = (SListSet) super.subList(0, b);
//        return st;
//    }
//
//    public SortedSet tailSet(Object fromElement) {
//        return null;
//    }
//
//
//}
