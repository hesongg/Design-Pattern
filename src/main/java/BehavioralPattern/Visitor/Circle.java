package BehavioralPattern.Visitor;

public class Circle implements Element{

    @Override
    public void accept(Visitor visitor) {
        visitor.coloring(this);
    }

    @Override
    public String getKorName() {
        return "원";
    }
}
