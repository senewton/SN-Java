package nl.ntpr.sne;

public class Circle extends Shape{
    // Attributes of a Circle
    double pi = 3.14;
    int radius;

    // Constructor
    Circle(int radius, String name)
    {
        // Super keyword refers to parent class
        super(name);
        // This keyword refers to current instance itself
        this.radius = radius;
    }

    @Override public void draw()
    {
        // Print statement
        System.out.println("Circle has been drawn ");
    }

    @Override public double area() {
        return (double)((pi * radius * radius));
    }
}
