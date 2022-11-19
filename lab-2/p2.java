package lab2;

import java.util.StringTokenizer;

public class prob2 {
    public static void main(String[] args){
        String s = "sir1 si sir2 sunt doua siruri";
        String s1 = "sir";
        String s2 = "sir2";
        int c1 = 0;
        int c2 = 0;
        int i;
        String[] g = s.split(" ");
        for(i = 0; i < g.length; i++){
            if(g[i].equals(s1)){
                c1++;
           }
           if(g[i].equals(s2)){
                c2++;
            }
        }
        System.out.println(c1);
        System.out.println(c2);
    }
}
