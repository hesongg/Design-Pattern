package CreationalPattern.AbstractFactory;

public class SquareFactory implements FigureAbstractFactory{
    @Override
    public Figure createFigure() {
        return new Square();
    }
}
