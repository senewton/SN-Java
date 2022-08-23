package nl.ntpr.sne;

public abstract class Shape {
    // Declare fields
    String objectName = " ";

    // Constructor of this class
    Shape(String name) { this.objectName = name; }

    public void moveTo(int x, int y)
    {
        System.out.println(this.objectName + " "
                + "has been moved to"
                + " x = " + x + " and y = " + y);
    }

    abstract public double area();

    abstract public void draw();
}
