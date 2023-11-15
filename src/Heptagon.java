public class Heptagon extends Shape {
    private int a;
    private int b;
    private int c;
    private int d;
    private int e;
    private int f;
    private int g;

    public Heptagon() {
    }

    public Heptagon(int a, int b, int c, int d, int e,int f,int g) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
    }

    @Override
    public double getPerimeter() {
        return a + b + c + d + e + f + g;

    }
}
