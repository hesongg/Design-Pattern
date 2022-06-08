package CreationalPattern.AbstractFactory;

public class Triangle implements Figure {
    private String color;

    public Triangle() {
        this.color = defaultColor;
    }

    @Override
    public String getFigure() {
        return "삼각형";
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }
}
