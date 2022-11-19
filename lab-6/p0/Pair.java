package lab6.problema0;

public class Pair {
    Object a, b;
    public Pair(Object a, Object b){
        this.a = a;
        this.b = b;
    }
    //metodele equals şi toString redefinite
    public boolean equals(Object obj) {
        if(obj == null) return false;
        if(!(obj instanceof Pair)) return false;
        Pair p = (Pair)obj;
        return p.a.equals(a) && p.b.equals(b);
    }
    public String toString(){
        return " " + a + " " + b;
    }
}
