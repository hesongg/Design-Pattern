package CreationalPattern.AbstractFactory;

public class Circle implements Figure {
    private String color;

    public Circle() {
        this.color = defaultColor;
    }

    @Override
    public String getFigure() {
        return "원";
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
