package StructuralPattern.Bridge;

public class Circle extends Shape{
    public Circle(Color color) {
        super(color);
    }

    @Override
    public void applyShape() {
        System.out.println(color.applyColor() + " 동그라미를 출력한다.");
    }
}
