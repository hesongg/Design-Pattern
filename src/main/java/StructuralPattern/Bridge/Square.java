package StructuralPattern.Bridge;

public class Square extends Shape{
    public Square(Color color) {
        super(color);
    }

    @Override
    public void applyShape() {
        System.out.println(color.applyColor() + " 사각형을 출력한다.");
    }
}
