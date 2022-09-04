package datatypes.primitive;

public class Cast {
    public static void main(String[] args) {
        // casting is when you assign a value of one primitive data type to another type

        // up casting is done automatically: byte > short > char > int > long > float > double
        int x = 5;
        System.out.println(x);
        double y = x; //double y makes a percentage/ decimal
        System.out.println(y);
        //upcasting is done automatically by java

        //down casting has to be done manually (narrowing): double > float > long > int > char > short > byte
        double z = 7;
        System.out.println(z);
        int w = (int) z;
        System.out.println(w);

        int b = 10;
        double g = b;
        System.out.println(g);

        double i = 15;
        System.out.println(i);
        int l = (int) i;

        float d = 6.75F;
        System.out.println(d);
        int u = (int) d;
        System.out.println(u);
        //this will only print 6 because int stands for whole numbers

    }}