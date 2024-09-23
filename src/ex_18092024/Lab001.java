package ex_18092024;

public class Lab001 {
    public static void main(String args[])
    {
        byte a =10;
        byte b= 12;
        //System.out.println(a+b);
        int c = a+b; // byte added results in int
        /*type casting
        widening - implicit, explicit - lossless
        narrowing - implict, explicit)=(with data type), loss

       */
        char ch = 'A';
        char bh = 'B';
        //System.out.println(ch+bh);
        byte f = 2;
        int x = f; //widening, implicit, will be done by JVM
        float y = (float)f; // widening, explicit.
        int g = 4;
        int r = f+g; // widening -implicit
        float s =  1440.0765f;
        //int w = r+s; // narrowing - implicit and hence invalid syntax
        int w = r+(int)s; //narrowing - explicit and hence it is valid.
        System.out.println(w);
        System.out.println(++g);
        System.out.println(g++);
        System.out.println(g);



    }

}
