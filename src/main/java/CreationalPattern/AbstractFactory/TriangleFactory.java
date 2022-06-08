package CreationalPattern.AbstractFactory;

public class TriangleFactory implements FigureAbstractFactory{
    @Override
    public Figure createFigure() {
        return new Triangle();
    }
}
