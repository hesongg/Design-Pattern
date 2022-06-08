package CreationalPattern.AbstractFactory;

public class CircleFactory implements FigureAbstractFactory{
    @Override
    public Figure createFigure() {
        return new Circle();
    }
}
