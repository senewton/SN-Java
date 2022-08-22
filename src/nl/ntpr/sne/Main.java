package nl.ntpr.sne;

public class Main {

    public static void main(String[] args) {
        System.out.println("Main Class");

        // Creating the Object of Rectangle class
        // and using shape class reference.
        Shape rect = new Rectangle(2, 3, "Rectangle");
        rect.draw();
        System.out.println("Area of rectangle: "
                + rect.area());

        rect.moveTo(1, 2);

        System.out.println(" ");

        // Creating the Objects of circle class
        Shape circle = new Circle(2, "Circle");
        circle.draw();
        System.out.println("Area of circle: "
                + circle.area());

        circle.moveTo(2, 4);

        // Creating the Objects of triangle class
        Triangle triangle = new Triangle(2,4);
        triangle.draw();
        System.out.println("Area of Triangle: "
                + triangle.area());

    }
}
