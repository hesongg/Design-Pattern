package CreationalPattern.AbstractFactory;

//super class
public interface Figure {
    public String defaultColor = "White";
    public String getFigure();
    public String getColor();
    public void setColor(String color);

    default void print(){
        System.out.println("Figure = " + getFigure() + ", Color = " + getColor());
    }
}
