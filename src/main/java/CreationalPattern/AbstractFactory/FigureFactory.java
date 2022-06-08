package CreationalPattern.AbstractFactory;

//서브 클래스들을 생성하기 위해 클라이언트 코드에 접점으로 제공되는 컨슈머 클래스(consumer class)
public class FigureFactory {
    public Figure makeFigure(FigureAbstractFactory factory) {
        return factory.createFigure();
    }
}
