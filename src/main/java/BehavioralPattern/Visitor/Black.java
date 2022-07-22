package BehavioralPattern.Visitor;

public class Black implements Visitor{

    @Override
    public void coloring(Circle circle) {
        System.out.println(circle.getKorName() + "을(를) 검은색으로 칠하자.");
    }

    @Override
    public void coloring(Rectangle rectangle) {
        System.out.println(rectangle.getKorName() + "을(를) 검은색으로 칠하자.");
    }

    @Override
    public void coloring(Triangle triangle) {
        System.out.println(triangle.getKorName() + "을(를) 검은색으로 칠하자.");
    }
}
