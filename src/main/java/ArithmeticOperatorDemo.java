public class ArithmeticOperatorDemo {
    public static void main(String[] args) {
        // +,-,*,/,%
        int a=10;
        int b=2;
        int c=a/b;
        System.out.println(c);
        //+=,-=,*=,/=,%=
        a= a+ 10;
        System.out.println("a= "+ a);
        // int d=b
        // b= b+1
        int d = b++;
        System.out.println("b= "+b);
        // b= b+1
        // b=e
        int e= ++b;
        System.out.println("e= "+e);



    }
}
