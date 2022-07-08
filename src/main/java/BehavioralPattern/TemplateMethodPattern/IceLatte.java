package BehavioralPattern.TemplateMethodPattern;

public class IceLatte extends IceCoffee{
    @Override
    public void putExtra() {
        System.out.println("우유를 넣는다.");
    }
}
