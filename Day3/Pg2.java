import java.util.Scanner;
public class Pg2 {
    public static void main(String[] args) {
        byte b1;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the value b1");
        b1=in.nextByte();
        System.out.println("The value of b1 is "+b1);
        int n;
        float t;
        double d;
        n=26567;
        t=n;
        d=n;
        System.out.println();
        t=145.561f;
        n=(int)t;
        d=t;
        System.out.println();
        d=1245.7865332;
        n=(int)d;
        t=(float)d;
        System.out.println("Value of n"+n+"t:"+t+"d:"+d);
        System.out.println((2+3.5));
    }
}
