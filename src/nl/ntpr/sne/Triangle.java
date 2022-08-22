package nl.ntpr.sne;

public class Triangle implements ShapeIntf {
    private int base;
    private int height;

    // constructor
    Triangle(int base, int height)
    {
        this.base = base;
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println("Triangle has been drawn ");
    }

    @Override
    public double area() {
        return ((double) base * (double) height)/2.0;
    }
}
