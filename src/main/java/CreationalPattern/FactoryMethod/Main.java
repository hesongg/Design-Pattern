package CreationalPattern.FactoryMethod;

public class Main {
    public static void main(String[] args) {
        FigureFactory factory = new FigureFactory();

        Figure s = factory.makeFigure("Square");
        Figure c = factory.makeFigure("Circle");
        Figure t = factory.makeFigure("Triangle");

        s.print();
        c.print();
        t.print();

        s.setColor("Black");
        s.print();
    }
}


