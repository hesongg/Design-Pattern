package StructuralPattern.Bridge;

public class Triangle extends Shape{
    public Triangle(Color color) {
        super(color);
    }

    @Override
    public void applyShape() {
        System.out.println(color.applyColor() + " 사각형을 출력한다.");
    }
}
