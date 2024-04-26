package lectures.lecture01;

public class TypeCasting {
    public static void main(String[] args) {

        // implicit casting..
        // byte -> short -> int -> long -> float -> double
        byte a = 23;
        short b = a;
        int c = b;
        long d = c;

        float e = d;
        double f = e;

        System.out.println(d);
        System.out.println(e);
        System.out.println(f);

        // explicit casting..
        // byte <- short <- int <- long <- float <- double

        double g = 102.0d;
        float h = (float) g;
        long i = (long) h;
        int j = (int) i;
        short k = (short) j;

        System.out.println(h);
        System.out.println(i);
        System.out.println(j);


    }
}
