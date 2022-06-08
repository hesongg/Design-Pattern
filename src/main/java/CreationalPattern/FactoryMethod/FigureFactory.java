package CreationalPattern.FactoryMethod;

public class FigureFactory {
    public Figure makeFigure(String type) {
        if (type.equals("Square")) return new Square();
        else if (type.equals("Circle")) return new Circle();
        else if (type.equals("Triangle")) return new Triangle();

        return null;
    }
}
