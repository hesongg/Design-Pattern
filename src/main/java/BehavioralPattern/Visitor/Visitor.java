package BehavioralPattern.Visitor;

public interface Visitor {

    void coloring(Circle circle);
    void coloring(Rectangle rectangle);
    void coloring(Triangle triangle);
}