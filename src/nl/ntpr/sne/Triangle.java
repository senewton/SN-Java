package nl.ntpr.sne;

public class Triangle implements ShapeIntf {
    private int base;
    private int height;

    // constructor
    Triangle(int base, int height)
    {
        this.base = base;
        this.height = height;

        int startX = xcoord+50;
        int startY = ycoord+60;

        System.out.println("Position (x,y): " + startX + startY);
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
