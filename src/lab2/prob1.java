package lab2;

public class prob1 {
    public static void main(String[] args)
    {
        String s1 = "si";
        String s = "sir1 si cu sir2 fac un sir3";
        int c = 0; //count
        int i = 0; //index
        while(i != -1){
            i = s.indexOf(s1, i);
            if(i != -1){
                c++;
                i = i + s1.length();
            }
        }
        System.out.println(c);
    }
}
