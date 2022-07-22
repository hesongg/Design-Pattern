package BehavioralPattern.Visitor;

public class Main {

    public static void main(String[] args) {

        Element circle = new Circle();
        Visitor black = new Black();

        circle.accept(black);

        circle.accept(new Red());

        Element rectangle = new Rectangle();
        Element triangle = new Triangle();

        rectangle.accept(new Red());
        triangle.accept(new Black());
    }
}
