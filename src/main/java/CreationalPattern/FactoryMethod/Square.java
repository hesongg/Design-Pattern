package CreationalPattern.FactoryMethod;

public class Square implements Figure{
    private String color;

    public Square() {
        this.color = defaultColor;
    }

    @Override
    public String getFigure() {
        return "사각형";
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
