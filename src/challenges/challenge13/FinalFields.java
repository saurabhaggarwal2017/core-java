package challenges.challenge13;

public class FinalFields {
    final int length;
    final int breadth;
    final int height;

    FinalFields(int length, int breadth, int height) {
        this.length = length;
        this.breadth = breadth;
        this.height = height;
    }

    @Override
    public String toString() {
        return "{Length = " + this.length + ", Breadth = " + this.breadth + ", Height = " + this.height + "}";
    }

    public static void main(String[] args) {
        FinalFields obj = new FinalFields(3, 4, 5);
        System.out.println(obj);
    }
}
