package CreationalPattern.AbstractFactory;

public class Main {
    public static void main(String[] args) {
        FigureFactory factory = new FigureFactory();

        Figure s = factory.makeFigure(new SquareFactory());
        Figure c = factory.makeFigure(new CircleFactory());
        Figure t = factory.makeFigure(new TriangleFactory());

        s.print();
        c.print();
        t.print();

        s.setColor("Black");
        s.print();
    }
}


