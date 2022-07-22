package BehavioralPattern.Visitor;

public class Red implements Visitor{

    @Override
    public void coloring(Circle circle) {
        System.out.println(circle.getKorName() + "을(를) 빨간색으로 칠하자.");
    }

    @Override
    public void coloring(Rectangle rectangle) {
        System.out.println(rectangle.getKorName() + "을(를) 빨간색으로 칠하자.");
    }

    @Override
    public void coloring(Triangle triangle) {
        System.out.println(triangle.getKorName() + "을(를) 빨간색으로 칠하자.");
    }
}
