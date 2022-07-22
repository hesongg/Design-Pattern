package BehavioralPattern.Visitor;

public interface Element {

    void accept(Visitor visitor);

    String getKorName();
}
