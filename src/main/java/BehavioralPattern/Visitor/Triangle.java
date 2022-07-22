package BehavioralPattern.Visitor;

public class Triangle implements Element{

    @Override
    public void accept(Visitor visitor) {
        visitor.coloring(this);
    }

    @Override
    public String getKorName() {
        return "삼각형";
    }
}
