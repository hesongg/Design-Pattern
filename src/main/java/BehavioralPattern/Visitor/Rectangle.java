package BehavioralPattern.Visitor;

public class Rectangle implements Element{

    @Override
    public void accept(Visitor visitor) {
        visitor.coloring(this);
    }

    @Override
    public String getKorName() {
        return "사각형";
    }
}
